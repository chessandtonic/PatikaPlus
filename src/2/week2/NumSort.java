package week2;

import java.util.Scanner;
import java.util.Arrays;

public class NumSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the desired size for your array: ");
        int n = scanner.nextInt();
        // Input validation to ensure that we receive sufficient elements
        if (n < 2) {
            System.out.println("You need more than 1 element for it to be an array.");
            return;
        }
        int[] array = new int[n];

        System.out.println("Enter each element: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Element: ");
            array[i] = scanner.nextInt();
        }
        // Sorting the array in ascending order
        Arrays.sort(array);

        System.out.print("Your array in ascending order is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
