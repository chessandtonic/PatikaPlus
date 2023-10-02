package week4;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the store!");
        return true;
    }
}
