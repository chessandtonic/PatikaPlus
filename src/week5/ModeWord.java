package week5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class ModeWord {

    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Split the text into words using regular expressions and create a HashMap to store word frequencies
        String[] words = text.toLowerCase().split(" "); // Convert words to lowercase to avoid case sensitivity
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Add words to the HashMap and update their counts
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Find the highest frequency
        int maxFrequency = 0;
        for (int count : wordCount.values()) {
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        System.out.print("Most frequent word(s): ");

        // Print the key with the highest value
        for (String key : words) {

            if (wordCount.get(key) == maxFrequency) {
                System.out.print(key+" ");
            }
        }
        System.out.print(", Count: " + maxFrequency);
    }
}