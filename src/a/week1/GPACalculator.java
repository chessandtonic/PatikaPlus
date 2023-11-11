package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class GPACalculator {
    public static void calculategpa() {
    int mat, fizik, kimya, turkce, tarih, muzik;

    Scanner grade = new Scanner(System.in);

    System.out.print("Matematik notunuzu giriniz: ");
    mat = grade.nextInt();

    System.out.print("Fizik notunuzu giriniz: ");
    fizik = grade.nextInt();

    System.out.print("Kimya notunuzu giriniz: ");
    kimya = grade.nextInt();

    System.out.print("Türkçe notunuzu giriniz: ");
    turkce = grade.nextInt();

    System.out.print("Tarih notunuzu giriniz: ");
    tarih = grade.nextInt();

    System.out.print("Müzik notunuzu giriniz: ");
    muzik = grade.nextInt();

    int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
    double sonuc = toplam / 6.0;
    String str = sonuc >= 60 ? "Sınıfı geçtiniz!" : "Sınıfta kaldınız!";
    System.out.println(str);
    }
}