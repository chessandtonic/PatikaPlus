package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class SUMofMul4 {
    public static void mul4() {
        int n, sum = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Please enter a number: ");
            n = scan.nextInt();
            if (n % 4 ==0) {
                sum += n;
            }
        } while (n % 2 == 0);

        System.out.println("The sum is: " + sum);
    }
}
