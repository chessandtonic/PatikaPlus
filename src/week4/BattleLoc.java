package week4;

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
        System.out.println("You are in the " + this.getName() + " now.");
        System.out.println("Be careful! A " + this.getMonster().getName() + " lives here!");
        return true;
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
}
