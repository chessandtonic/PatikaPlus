package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class DigitSumCalculator {
    // Recursive function to calculate the sum of digits
    public static int sumOfDigits(int number) {
        // Base case: If the number is 0, return 0 (no digits to sum)
        if (number == 0) {
            return 0;
        }
        // Recursive case: Sum the last digit and call the function for the remaining part of the number
        return number % 10 + sumOfDigits(number / 10);
    }

    public static void digitSum(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        // Calculate the sum of digits using the recursive function
        int sum = sumOfDigits(n);

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
