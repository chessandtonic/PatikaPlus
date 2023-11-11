package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class PerfectNumFinder {
    public static void perfNum() {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number to be checked
        System.out.println("Please enter the number you want to check: ");

        // Read the input number
        int n = input.nextInt();
        int divisorsTotal = 0;

        // Start the loop from 1 and iterate up to n/2 (inclusive). All 'known' perfect numbers are even, so there is no need to iterate up to n.
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisorsTotal += i;
            }
        }

        // Check if the input number is equal to the sum of its proper divisors
        if (n == divisorsTotal) {
            // If it is, print that it's a PERFECT NUMBER
            System.out.println("The number you entered is a PERFECT NUMBER!");
        } else {
            // If it's not, print that it's not a perfect number
            System.out.println("The number you entered is NOT a perfect number.");
        }
        input.close();
    }
}
