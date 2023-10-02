package week4;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the store!");
        System.out.println();
        System.out.println("1. Buy a weapon");
        System.out.println("2. Buy an armor");
        System.out.println("3. Leave");
        System.out.println();
        System.out.println("What would you like to do today?");
        int selectCase = Location.input.nextInt();

        while (selectCase < 1 || selectCase > Weapon.weapons().length) {
            System.out.print("Invalid choice, please try again: ");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Hope to see you again soon!");
                return true;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons:");
        System.out.println();
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getID() + "." + weapon.getName() + "\t|" +
                    "\t<Price: " + weapon.getPrice() + "\t|" +
                    "Damage: " + weapon.getDamage() + ">");
        }
        System.out.println("Please select a weapon:");

        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Invalid choice, please try again: ");
            selectWeaponID = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponbyID(selectWeaponID);

        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("You don't have enough money for this weapon!");
            } else {
                System.out.println("You just bought a " + selectedWeapon.getName() + "!");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("New balance: " + this.getPlayer().getMoney());
            }
        }
    }

    public void printArmor() {
        System.out.println("Armor:");
    }
}
