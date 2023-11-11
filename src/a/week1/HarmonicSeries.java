package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class HarmonicSeries {
    public static void harmonic() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide an upper limit:");
        int n = input.nextInt();

        double sum = 0.0;
        // Loop to calculate the harmonic series
        for (double i = 1; i <= n; i++) {
            sum += (1/i);
        }
        System.out.println("Sum is " + sum);
    }
}
