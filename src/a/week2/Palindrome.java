package a.week2;

public class Palindrome {
    // This method checks if a string is a palindrome using two pointers.
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // This method checks if a string is a palindrome by creating a reversed version of the string
    // and comparing it to the original string.
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // Test the isPalindrome method with the string "great" and print the result.
        System.out.println(isPalindrome("great"));
    }
}
