package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class UcgenAlan {
        public static void alan() {

            double a, b, c, u, alan;
            Scanner input = new Scanner(System.in);

            System.out.print("1. Kenarı girin: ");
            a = input.nextDouble();
            System.out.print("2. Kenarı Girin: ");
            b = input.nextDouble();
            System.out.print("3. Kenarı Girin: ");
            c = input.nextDouble();

            u = (a + b + c) / 2;
            alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

            System.out.print("üçgenin alanı: " + alan);
        }
}