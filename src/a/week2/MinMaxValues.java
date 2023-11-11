package a.week2;

import java.util.Scanner;

public class MinMaxValues {
    public static void main(String[] args) {
        // Getting input from the user
        int target;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a target number: ");
        target = input.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int minDiff = Integer.MAX_VALUE; // Initialize minDiff with a large value
        int maxDiff = Integer.MIN_VALUE; // Initialize maxDiff with a small value
        int minIndex = 0; // Initialize minIndex
        int maxIndex = 0; // Initialize maxIndex

        for (int i = 0; i < list.length; i++) {
            int difference = Math.abs(list[i] - target);

            if (difference < minDiff) {
                minDiff = difference;
                minIndex = i;
            }

            if (difference > maxDiff) {
                maxDiff = difference;
                maxIndex = i;
            }
        }

        System.out.println("Nearest number to " + target + " is: " + list[minIndex]);
        System.out.println("Farthest number from " + target + " is: " + list[maxIndex]);

        input.close();
    }
}




