package week4;

public class Weapon {

    private String name;
    private int ID;
    private int damage;
    private int price;

    public Weapon(String name, int ID, int damage, int price) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Pistol", 1,2, 15);
        weaponList[1] = new Weapon("Sword ", 2,3, 35);
        weaponList[2] = new Weapon("Rifle ", 3,7, 45);

        return weaponList;
    }

    public static Weapon getWeaponByID(int ID){
        for (Weapon weapon : Weapon.weapons()) {
            if (weapon.getID() == ID) {
                return weapon;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
