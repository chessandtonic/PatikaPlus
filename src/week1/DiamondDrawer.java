package week1;

import java.util.Scanner;

public class DiamondDrawer {
    public static void diamond() {
        int n = 0; // Adjust the value of n for the desired diamond size

        Scanner input = new Scanner (System.in);

        // Print the top half of the diamond
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Print the bottom half of the diamond (excluding the center line)
        for (int i = (n-1); i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
