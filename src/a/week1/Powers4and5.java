package a.week1;
import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class Powers4and5 {
    public static void pow4and5(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Powers of 4:");
        for (int i = 1; i <= n; i++) {
            int powerOf4 = (int) Math.pow(4, i); // Calculate 4 raised to the power of i
            if (powerOf4 <= n) {
                System.out.print(powerOf4 + " ");
            } else {
                break; // Stop printing powers that exceed the entered number
            }
        }

        System.out.println("\nPowers of 5:");
        for (int i = 1; i <= n; i++) {
            int powerOf5 = (int) Math.pow(5, i); // Calculate 5 raised to the power of i
            if (powerOf5 <= n) {
                System.out.print(powerOf5 + " ");
            } else {
                break; // Stop printing powers that exceed the entered number
            }
        }

        scanner.close();
    }
}
