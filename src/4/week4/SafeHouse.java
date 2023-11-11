package week4;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        if ((getPlayer().getInventory().getAwards()[0]+getPlayer().getInventory().getAwards()[1]+getPlayer().getInventory().getAwards()[2]) == 3) {
            System.out.println("You won!");
            return false;
        }
        System.out.println("You're in the safe house, your health is replenished!");
        this.getPlayer().setHealth(this.getPlayer().getInitHealth());
        return true;
    }
}
