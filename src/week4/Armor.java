package week4;

public class Armor {
    private int ID;
    private String name;
    private int shield;
    private int price;

    public Armor(int ID, String name, int shield, int price) {
        this.ID = ID;
        this.name = name;
        this.shield = shield;
        this.price = price;
    }
    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Light  ",1, 15);
        armorList[1] = new Armor(2, "Medium ",3, 25);
        armorList[2] = new Armor(3, "Heavy  ",5, 40);

        return armorList;
    }

    public static Armor getArmorByID(int ID){
        for (Armor armor : Armor.armors()) {
            if (armor.getID() == ID) {
                return armor;
            }
        }
        return null;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}