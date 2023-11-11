package week4;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Monster monster;
    private String award;
    private int awardID;
    private int maxMonster;



    public BattleLoc(Player player, String name, Monster monster, String award, int awardID, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.awardID = awardID;
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
        String selectCase = input.next() + input.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("F") && combat(monsterNumber)) {
            System.out.println(this.getPlayer().getName() + ", you have defeated all enemies!");
            if (awardID < 3) {
                this.getPlayer().getInventory().getAwards()[this.awardID] = this.awardID;
            }
            return true;
        }

        if (this.getPlayer().getHealth() == 0) {
            System.out.println("You died.");
            return false;
        }

        return true;
    }

    public boolean combat(int monsterNumber) {
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getInitHealth());
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                boolean playersTurn = Math.random() < 0.5f; // Randomly decide who gets to hit first

                if (playersTurn) {
                    // Player's turn
                    System.out.println("<H>it or <R>un?");
                    String selectMove = input.nextLine().toUpperCase();
                    if (selectMove.equals("H")) {
                        System.out.println("You hit the " + getMonster().getName() + "!");
                        this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getMonster().getHealth() > 0) {
                            System.out.println(this.getMonster().getName() + " hit you!");
                            int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getShield();
                            if (monsterDamage < 0) {
                                monsterDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                } else {
                    // Monster's turn
                    System.out.println(this.getMonster().getName() + " hit you!");
                    int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getShield();
                    if (monsterDamage < 0) {
                        monsterDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                    afterHit();
                    if (this.getPlayer().getHealth() > 0) {
                        System.out.println("You hit the " + getMonster().getName() + "!");
                        this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                    } else {
                        return true;
                    }
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("You defeated the enemy!");
                System.out.println("You earned " + this.getMonster().getReward());
                this.getPlayer().setMoney(this.getPlayer().getMoney() + getMonster().getReward());
                System.out.println("New balance: " + getPlayer().getMoney());
                System.out.println();
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Your health: " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + "'s health: " + this.getMonster().getHealth());
        System.out.println();
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

    public void monsterStats(int i) {
        System.out.println(i + "." + this.getMonster().getName() + " Stats:");
        System.out.println("-------------------------");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getDamage());
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

    public int getAwardID() {
        return awardID;
    }

    public void setAwardID(int awardID) {
        this.awardID = awardID;
    }
}
