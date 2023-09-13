package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class OperationOrder {
    public static void opOrder() {
    // Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
    Scanner scanner = new Scanner(System.in);

    // Kullanıcıdan üç sayıyı alıyoruz
    System.out.print("Birinci sayıyı girin: ");
    double a = scanner.nextDouble();

    System.out.print("İkinci sayıyı girin: ");
    double b = scanner.nextDouble();

    System.out.print("Üçüncü sayıyı girin: ");
    double c = scanner.nextDouble();

    // İşlemi hesaplayıp sonucu ekrana yazdırıyoruz
    double sonuc = a + b * c - b;
    System.out.println("İşlem sonucu: " + sonuc);

    // Scanner'ı kapatıyoruz
    scanner.close();
    }
}