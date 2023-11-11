package week4;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player,"Cave" , new Zombie(), "Food",0, 3);
    }
}
