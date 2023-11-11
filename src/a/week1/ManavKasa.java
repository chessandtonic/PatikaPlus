package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class ManavKasa {
    public static void checkout() {
        float ArmutFiyat = 2.14f;
        float ElmaFiyat = 3.67f;
        float DomatesFiyat = 1.11f;
        float MuzFiyat = 0.95f;
        float PatlicanFiyat = 5.00f;
        float Total =0.0f;
        float ArmutKg, ElmaKg, DomatesKg, MuzKg, PatlicanKg, ToplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız?");
        ArmutKg = input.nextFloat();
        System.out.println("Kaç kilo elma aldınız?");
        ElmaKg = input.nextFloat();
        System.out.println("Kaç kilo domates aldınız?");
        DomatesKg = input.nextFloat();
        System.out.println("Kaç kilo muz aldınız?");
        MuzKg = input.nextFloat();
        System.out.println("Kaç kilo patlıcan aldınız?");
        PatlicanKg = input.nextFloat();

        ToplamTutar = ((ArmutFiyat*ArmutKg)+(ElmaFiyat*ElmaKg) + (DomatesFiyat*DomatesKg) + (MuzFiyat*MuzKg) + (PatlicanFiyat*PatlicanKg));
        System.out.println("Toplam tutarınız: "+ToplamTutar);
    }
}
