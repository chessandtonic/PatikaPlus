package week4;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You're in the safe house, your health is replenished!");
        return true;
    }
}
