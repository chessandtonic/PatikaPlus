package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class CombinationCalculator {
    // Function to calculate the factorial of a number
    public static long factorial(int num) {
        // Base case: If the number is 0 or 1, return 1 (factorial of 0 or 1 is 1)
        if (num <= 1) {
            return 1;
        }
        // Recursive case: Calculate the factorial by multiplying the number by the factorial of (num - 1)
        return num * factorial(num - 1);
    }

    public static void combination() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        // Check the validity of the input
        if (n < k || n < 0 || k < 0) {
            // Print an error message if the input is invalid
            System.out.println("Invalid input. Make sure n >= k and both are non-negative.");
        } else {
            // Calculate the combination using the combination formula
            long combination = factorial(n) / (factorial(k) * factorial(n - k));

            System.out.println("C(" + n + ", " + k + ") = " + combination);
        }
        scanner.close();
    }
}
