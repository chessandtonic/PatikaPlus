package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class Calculator {
    public static void calculate() {
        int s1, s2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        s1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem seçiminiz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1 -> System.out.println("Sonuç: " + (s1 + s2));
            case 2 -> System.out.println("Sonuç: " + (s1 - s2));
            case 3 -> System.out.println("Sonuç: " + (s1 * s2));
            case 4 -> System.out.println("Sonuç: " + (s1 / s2));
            default -> System.out.println("Hatalı giriş yaptınız!");
        }
    }
}

