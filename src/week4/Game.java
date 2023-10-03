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
            System.out.println("3. Cave (Come and have a feast, but beware of the living dead!)");
            System.out.println("4. Forest (You might warm up, but only until the forest bleeds you dry!)");
            System.out.println("5. River (Enjoy a nice sip, but watch out for the claw!)");
            System.out.println("0. Exit and Quit");
            System.out.println();
            System.out.println("Please select where you want to go:");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Please enter a valid zone!");
                    continue;
            }
            if (location == null) {
                System.out.println("You gave up on this island too quick!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
