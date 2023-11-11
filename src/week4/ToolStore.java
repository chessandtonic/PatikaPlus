package week4;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        boolean showMenu = true;
        while (showMenu) {
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
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Hope to see you again soon!");
                    showMenu = false;
                    break;
            }
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
        System.out.println("Your balance: " + this.getPlayer().getMoney());
        System.out.println();
        System.out.println("0. Exit");
    }

    public void buyWeapon() {
        System.out.println("Please make a selection:");

        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Invalid choice, please try again: ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You have insufficient funds to make this purchase!");
                } else {
                    System.out.println("You just bought a " + selectedWeapon.getName() + "!");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("New balance: " + this.getPlayer().getMoney());
                    System.out.println();
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
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
        System.out.println("Your balance: " + this.getPlayer().getMoney());
        System.out.println();
        System.out.println("0. Exit");
    }

    public void buyArmor() {
        System.out.println("Please select an armor:");

        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Invalid choice, please try again: ");
            selectArmorID = input.nextInt();
        }
        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You have insufficient funds to make this purchase!");
                } else {
                    System.out.println("You just bought a " + selectedArmor.getName() + "Armor!");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("New balance: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}
