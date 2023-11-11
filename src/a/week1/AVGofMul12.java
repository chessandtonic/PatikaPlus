package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class AVGofMul12 {
        public static void div12() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            // The exercise we had asks for the numbers divisible by 3 and 4, and that actually takes us to divisibility by 12.

            int sum = 0; // To store the sum of numbers divisible by 12
            int count = 0; // To keep track of the count of numbers divisible by 12

            for (int i = 1; i <= n; i++) { // Start from 1 to include the number itself
                if (i % 12 == 0) { // Check if the number is divisible by 12
                    sum += i;
                    count++;
                }
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Average: " + average);
            } else {
                System.out.println("There are no numbers divisible by both 3 and 4 in the given range.");
            }
            scanner.close();
        }
    }


