package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class TypeCasting {
        public static void typeCast() {
            // Scanner kullanarak kullanıcıdan bir tam sayı ve ondalıklı sayı alıyoruz
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir tam sayı girin: ");
            int tamSayi = scanner.nextInt();

            System.out.print("Bir ondalıklı sayı girin: ");
            double ondalikliSayi = scanner.nextDouble();

            // Tam sayıyı ondalıklı sayıya dönüştürerek ekrana yazdırıyoruz
            double tamSayiOndalikli = (double) tamSayi;
            System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdüğümüzde: " + tamSayiOndalikli);

            // Ondalıklı sayıyı tam sayıya dönüştürerek ekrana yazdırıyoruz
            int ondalikliSayiTam = (int) ondalikliSayi;
            System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğümüzde: " + ondalikliSayiTam);

            scanner.close();
        }
}
