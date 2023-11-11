package week2;
import java.util.Scanner;

public class PalindromeFinder {
    public static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        boolean result = isPalindrome(number);
        String answer = result ? "Yes" : "No"; // Convert true/false to "Yes" or "No"
        System.out.println("Is it a palindrome? " + answer);
    }
}

