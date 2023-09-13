package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class MinMaxFinder {
            public static void minMax () {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Kaç tane sayı gireceksiniz: ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Lütfen pozitif bir sayı giriniz.");
                    return;
                }

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int i = 1; i <= n; i++) {
                    System.out.print(i + ". Sayıyı giriniz: ");
                    int sayi = scanner.nextInt();

                    if (sayi < min) {
                        min = sayi;
                    }

                    if (sayi > max) {
                        max = sayi;
                    }
                }

                System.out.println("En büyük sayı: " + max);
                System.out.println("En küçük sayı: " + min);

                scanner.close();
            }
}