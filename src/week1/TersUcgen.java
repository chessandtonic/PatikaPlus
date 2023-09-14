package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class TersUcgen {
    public static void tersUcgen() {

        Scanner n = new Scanner(System.in);
        int count = n.nextInt();

        for (int i = count; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* Another solution
public class Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // Variable identification
                int number;

                // Retrieving data from the user
                System.out.print("Please enter a number:");
                number = input.nextInt();

                // Calculation Section

                for ( int i = number; i >= 1; i--) {
                        for (int k = 1;k <= (number-i); k++) {
                                System.out.print(" ");
                        }
                        for (int j = 1; j <= (2*i) - 1; j++ ) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }
}
*/