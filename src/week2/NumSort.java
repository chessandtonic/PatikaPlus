package week2;

import java.util.Scanner;
import java.util.Arrays;

public class NumSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the desired size for your array: ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];

        System.out.println("Enter each element: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Element: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        System.out.print("Your array in an ascending order: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        scanner.close();
    }
}
