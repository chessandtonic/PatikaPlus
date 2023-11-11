package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class ChineseZodiac {
       public static void zodiac() {

            Scanner input = new Scanner(System.in);

            System.out.print("Doğum Yılınızı Giriniz : ");
            int birthYear = input.nextInt();

            // Calculation of the Chinese Zodiac Signs
            int remainder = birthYear % 12;

            // Cases for different Zodiac Signs
            switch (remainder) {
                case 0 -> System.out.println("Çin Zodyağı Burcunuz: Maymun");
                case 1 -> System.out.println("Çin Zodyağı Burcunuz: Horoz");
                case 2 -> System.out.println("Çin Zodyağı Burcunuz: Köpek");
                case 3 -> System.out.println("Çin Zodyağı Burcunuz: Domuz");
                case 4 -> System.out.println("Çin Zodyağı Burcunuz: Fare");
                case 5 -> System.out.println("Çin Zodyağı Burcunuz: Öküz");
                case 6 -> System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                case 7 -> System.out.println("Çin Zodyağı Burcunuz: Tavşan");
                case 8 -> System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                case 9 -> System.out.println("Çin Zodyağı Burcunuz: Yılan");
                case 10 -> System.out.println("Çin Zodyağı Burcunuz: At");
                case 11 -> System.out.println("Çin Zodyağı Burcunuz: Koyun");
                default -> System.out.println("Hatalı giriş yaptınız.");
            }
       }
}
