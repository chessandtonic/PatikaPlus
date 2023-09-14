package week1;
import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class PowerCalculator {
    public static void power(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the base:");
        base = input.nextInt();
        System.out.println("Please provide the exponent:");
        exponent = input.nextInt();
        int total = 1;

        for (int i=1; i <= exponent; i++) {
            total *= base;
        }

        System.out.println("Result: " + total);
    }
}
