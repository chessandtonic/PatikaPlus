package week4;

public class BattleLoc extends Location {
    private Monster;

    public BattleLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
