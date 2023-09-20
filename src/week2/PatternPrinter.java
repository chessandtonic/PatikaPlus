package week2;

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n<=0) {
            System.out.println("The number you've entered is not positive, please try again.");
            return;
        }

        recursiveOperation(n, n, true);
    }

    public static void recursiveOperation(int current, int original, boolean increasing) {
        System.out.print(current + " ");

        if (increasing && current <= 0) {
            increasing = false;
        }

        if (current == original && !increasing) {
            return;
        }

        if (increasing) {
            recursiveOperation(current - 5, original, increasing);
        } else {
            recursiveOperation(current + 5, original, increasing);
        }
    }
}

