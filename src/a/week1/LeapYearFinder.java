package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class LeapYearFinder {
    public static void leapYear() {

        Scanner scanner = new Scanner(System.in);

        //Get input from the user
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();

        /* Leap Year Calculation; true if the year is divisible by 4 or by 100 and 400. */
        if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}