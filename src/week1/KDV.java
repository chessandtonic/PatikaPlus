package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class KDV {
    public static void kdv() {
        double tutar, KDVOran = 0.18, KDVTutar, KDVliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        KDVOran = (tutar <= 1000) ? 0.18 : 0.08;

        KDVTutar = tutar * KDVOran;
        KDVliTutar = tutar + KDVTutar;
        System.out.println(KDVliTutar);
    }
}