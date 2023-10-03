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
                buyWeapon();
                buyArmor();
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
                    "\t<Price: " + weapon.getPrice() + " | " +
                    "Damage: " + weapon.getDamage() + ">");
        }
    }
    public void buyWeapon () {
        System.out.println("Please select a weapon:");

        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Invalid choice, please try again: ");
            selectWeaponID = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponByID(selectWeaponID);

        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("You have insufficient funds to make this purchase!");
            } else {
                System.out.println("You just bought a " + selectedWeapon.getName() + "!");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("New balance: " + this.getPlayer().getMoney());
                //System.out.println("Previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                //System.out.println("New weapon: " + this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }

    public void printArmor() {
        System.out.println("Armors:");
        System.out.println();
        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getID() + "." + armor.getName() + "\t|" +
                    "\t<Price: " + armor.getPrice() + " | " +
                    "Shield: " + armor.getShield() + ">");
        }
    }
    public void buyArmor() {
        System.out.println("Please select an armor:");

        int selectArmorID = input.nextInt();
        while (selectArmorID < 1 || selectArmorID > Armor.armors().length) {
            System.out.print("Invalid choice, please try again: ");
            selectArmorID = input.nextInt();
        }

        Armor selectedArmor = Armor.getArmorByID(selectArmorID);

        if (selectedArmor != null) {
            if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("You have insufficient funds to make this purchase!");
            }else {
                System.out.println("You just bought a " + selectedArmor.getName() + "!");
                int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("New balance: " + this.getPlayer().getMoney());
                // System.out.println("Previous armor: " + this.getPlayer().getInventory().getArmor().getName());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                // System.out.println("New armor: " + this.getPlayer().getInventory().getArmor().getName());
            }
        }
    }
}
