package week4;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;


    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterNumber();

        System.out.println("You are in the " + this.getName() + " now.");
        if (monsterNumber == 1) {
            System.out.println("Be careful! A " + this.getMonster().getName() + " lives here!");
        } else {
            System.out.println("Be careful! " + monsterNumber + " " + this.getMonster().getName() + "s live here!");
        }
        System.out.println("<F>ight or <Fl>ight?");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("F")) {
            if (combat(monsterNumber)) {
                System.out.println(this.getName() + ", you have defeated all enemies!");
                return true;
            }
        }
        if (this.getPlayer().getHealth() < 0) {
            System.out.println("You died'");
            return false;
        }

        return true;
    }

    public boolean combat(int monsterNumber) {
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getInitHealth());
            playerStats();
            monsterStats();
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.println("<H>it or <R>un?");
                String selectMove = input.nextLine().toUpperCase();
                if (selectMove.equals("H")) {
                    System.out.println("You hit the monster!");
                    this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getMonster().getName() + " hit you!");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getShield();
                        if (monsterDamage < 0) {
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                    }
                }
            }
        }
        return false;
    }

    public void afterHit() {
        System.out.println("Your health: " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + "'s health: " + this.getMonster().getHealth());
    }

    public void playerStats() {
        System.out.println("Player Stats:");
        System.out.println("-------------------------");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Armor:  " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Shield: " + this.getPlayer().getInventory().getArmor().getShield());
        System.out.println("Money:  " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void monsterStats() {
        System.out.println(this.getMonster().getName() + " Stats:");
        System.out.println("-------------------------");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getHealth());
        System.out.println("Reward: " + this.getMonster().getReward());
        System.out.println();
    }

    public int randomMonsterNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1; // Randomizer will give 0 to Max-1 , hence the +1
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
