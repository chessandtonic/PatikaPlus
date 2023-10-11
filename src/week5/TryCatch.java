package week5;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide an index between 1 and 10: ");
        int index = scanner.nextInt() - 1; // Read user input and subtract 1 to match array indexing (0 to 9)
        System.out.println(index);
        // Try block to handle potential exceptions
        try {
            // Call the CheckIndex method to validate the index and retrieve the corresponding letter
            String result = CheckIndex(letters, index);

            System.out.println("Index value is " + "\"" + result + "\".");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle ArrayIndexOutOfBoundsException
            // Print an error message indicating that there are only 10 list items
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check the validity of the index and retrieve the corresponding letter
    public static String CheckIndex(String[] letters, int index) {
        // Check if the index is outside the valid range (0 to 9)
        if (index < 0 || index >= letters.length) {
            // Throw an ArrayIndexOutOfBoundsException with a custom error message
            throw new ArrayIndexOutOfBoundsException("There are only 10 list items.");
        }
        // If the index is valid, return the corresponding letter from the array
        return letters[index];
    }
}