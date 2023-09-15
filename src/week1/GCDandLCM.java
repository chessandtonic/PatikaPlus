package week1;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate GCD and LCM
        int gcd = calculateGCD(number1, number2);
        int lcm = calculateLCM(number1, number2);

        // Display the results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        scanner.close();
    }

    // Function to calculate the GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
}