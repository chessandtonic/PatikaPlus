package week4;

import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to our Adventure Game!");
        System.out.println("Please enter your name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println();
        System.out.println("Welcome to this mysterious Island, " + player.getName() + "!");
        System.out.println();
        player.selectChar();

        Location location = null;
        while (true) {
            player.printStatus();
            System.out.println();
            System.out.println("Zones:");
            System.out.println("1. Safe House");
            System.out.println("2. Store");
            System.out.println();
            System.out.println("Please select where you want to go:");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
