package a.week2;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime.");
        } else {
            System.out.println(number + " is not a prime.");
        }
    }

    // Recursive function to check if the number is a prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and negative numbers are not primes
        }
        return isPrimeRecursive(number, 2); // Check starting from 2
    }

    private static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor * divisor > number) {
            return true; // No divisors found, it's a prime
        }
        if (number % divisor == 0) {
            return false; // If divisible by another number, then it's not a prime
        }
        return isPrimeRecursive(number, divisor + 1); // Check the next divisor
    }
}

