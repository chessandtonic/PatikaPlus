package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class DaireAlan {
    public static void daire() {
    int r;
    double alpha, pi = 3.14;

    Scanner input = new Scanner(System.in);

    System.out.print("Dairenin yarıçapı: ");
    r = input.nextInt();
    System.out.print("Merkez açısının ölçüsü: ");
    alpha = input.nextDouble();

    double alan = (pi * (r * r) * alpha) / 360;

    System.out.println("Dairenin alanı:" + alan);
    }
}
