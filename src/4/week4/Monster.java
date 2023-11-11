package week4;

public class Monster {
    private int ID;
    private String name;
    private int damage;
    private int health;
    private int reward;
    private int initHealth;

    public Monster(int ID, String name, int damage, int health, int reward) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.initHealth = health;
        this.reward = reward;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getInitHealth() {
        return initHealth;
    }

    public void setInitHealth(int initHealth) {
        this.initHealth = initHealth;
    }
    /*public void reward (Player player) {
        player.setMoney(player.getMoney() + award);
        System.out.println("Earned " + award!");
    }*/
}
