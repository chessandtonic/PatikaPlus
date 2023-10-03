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
            System.out.println("Be careful! A " +  this.getMonster().getName() + " lives here!");
        } else {
            System.out.println("Be careful! " +  monsterNumber +" "+ this.getMonster().getName() + "s live here!");
        }

        return true;
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
