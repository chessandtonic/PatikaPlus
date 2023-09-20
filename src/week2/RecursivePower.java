package week2;
import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {
        int base, power;

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabanı giriniz: ");
        base = scan.nextInt();

        System.out.println("Üssü giriniz: ");
        power = scan.nextInt();

        int result = calculatePower(base, power);
        System.out.println("Sonuç: " + result);

    }
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * calculatePower(base, exponent - 1);
    }
}
