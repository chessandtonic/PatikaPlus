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

        while (selectCase < 1 || selectCase > 3) {
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
            System.out.println(weapon.getName() + "\t|" +
                    "\t<Price: " + weapon.getPrice() + "|" +
                    "Damage: " + weapon.getDamage() + ">");
        }
    }


    public void printArmor() {
        System.out.println("Armor:");
    }
}
