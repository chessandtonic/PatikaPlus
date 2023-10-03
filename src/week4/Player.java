package week4;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    private final Scanner input = new Scanner(System.in);
    private Inventory inventory;


    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        Samurai Samurai = new Samurai();
        Archer Archer = new Archer();
        Knight Knight = new Knight();

        System.out.println("Characters:");
        Characters[] charList = {new Samurai(), new Archer(), new Knight()};

        for (Characters Characters : charList) {
            System.out.println("ID: " + Characters.getID() +
                    "\tCharacter: " + Characters.getName() +
                    "\t| Damage: " + Characters.getDamage() +
                    "\tHealth: " + Characters.getHealth() +
                    "\tMoney: " + Characters.getMoney());
        }
        System.out.println();
        System.out.print("Please select your character using its ID: \n");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(Characters characters) {
        this.setDamage(characters.getDamage());
        this.setHealth(characters.getHealth());
        this.setMoney(characters.getMoney());
        this.setCharName(characters.getName());
    }

    public void printStatus() {
        System.out.println("Status:\t" +
                "\tWeapon: " + this.getInventory().getWeapon().getName() + " | " +
                "Armor: " + this.getInventory().getArmor().getName() + " | " +
                "Shield: " + this.getInventory().getArmor().getShield() + " | " +
                "Damage: " + this.getDamage() + " | " +
                "Health: " + this.getHealth() + " | " +
                "Money: " + this.getMoney());
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}