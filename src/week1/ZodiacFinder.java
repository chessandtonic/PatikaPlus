package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class ZodiacFinder {
    public static void zodiac() {

        Scanner input = new Scanner(System.in);
        // Get date information from the user
        System.out.print("Please enter your birth month in numbers: ");
        int month = input.nextInt();
        System.out.print("Please enter your birthday in numbers: ");
        int day = input.nextInt();
        String sign;
        // Identify the sign
        switch (month) {
            case 12 -> {
                sign = (day <= 21) ? "You're a Sagittarius!" : "You're a Capricorn!";
                System.out.print(sign);
            }
            case 11 -> {
                sign = (day <= 21) ? "You're a Scorpio!" : "You're a Sagittarius!";
                System.out.print(sign);
            }
            case 10 -> {
                sign = (day <= 22) ? "You're a Libra!" : "You're a Scorpio!";
                System.out.print(sign);
            }
            case 9 -> {
                sign = (day <= 22) ? "You're a Virgo!" : "You're a Libra!";
                System.out.print(sign);
            }
            case 8 -> {
                sign = (day <= 22) ? "You're a Leo!" : "You're a Virgo!";
                System.out.print(sign);
            }
            case 7 -> {
                sign = (day <= 22) ? "You're a Cancer!" : "You're a Leo!";
                System.out.print(sign);
            }
            case 6 -> {
                sign = (day <= 22) ? "You're a Gemini!" : "You're a Cancer!";
                System.out.print(sign);
            }
            case 5 -> {
                sign = (day <= 21) ? "You're a Taurus!" : "You're a Gemini!";
                System.out.print(sign);
            }
            case 4 -> {
                sign = (day <= 20) ? "You're an Aries!" : "You're a Taurus!";
                System.out.print(sign);
            }
            case 3 -> {
                sign = (day <= 20) ? "You're a Pisces!" : "You're an Aries!";
                System.out.print(sign);
            }
            case 2 -> {
                sign = (day <= 19) ? "You're an Aquarius!" : "You're a Pisces!";
                System.out.print(sign);
            }
            case 1 -> {
                sign = (day <= 21) ? "You're a Capricorn!" : "You're an Aquarius!";
                System.out.print(sign);
            }
            default -> System.out.print("Please check your dates.");
        }
    }
}