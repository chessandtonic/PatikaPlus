package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class Fibonacci {
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the Fibonacci series
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Print the Fibonacci Series
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i <= n; i++) { // Change the loop condition to <= n
            System.out.print(fibonacci(i) + " "); // Call the fibonacci function and print each element
        }
        scanner.close();
    }
    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base case: Fibonacci of 0 and 1 is the number itself
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 and 1 is the number itself; the output of the algorithm starts with the second 1.
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: Calculate Fibonacci number for larger n by recursively calling itself
        }
    }
}




