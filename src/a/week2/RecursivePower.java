package a.week2;
import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {
        int base, power;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide a base: ");
        base = scan.nextInt();

        System.out.println("Please provide a power: ");
        power = scan.nextInt();

        int result = calculatePower(base, power);
        System.out.println("Result is: " + result);

    }
    // Recursive function to calculate the result
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * calculatePower(base, exponent - 1);
    }
}
