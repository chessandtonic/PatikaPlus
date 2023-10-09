package week5;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide an index between 1 and 10: ");
        int index = scanner.nextInt()-1;

        try {
            String result = checkIndex(letters, index);
            System.out.println("Index value is " + "\"" + result +"\".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String checkIndex(String[] letters, int index) {
        if (index < 0 || index >= letters.length) {
            throw new ArrayIndexOutOfBoundsException("There are only 10 list items.");
        }
        return letters[index];
    }
}