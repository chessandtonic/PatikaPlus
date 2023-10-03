package week4;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean food;

    public Inventory() {
        this.weapon = new Weapon (-1,"Fist" , 0, 0);
        this.armor = new Armor(-1, "Cloth", 0, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
}
