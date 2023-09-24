package week2;

import java.util.Arrays;

public class EvenNumReoccur {
    static boolean isFound (int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 7, 10, 3, 2, 6, 10, 22, 1, 7, 6, 22, 2};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFound(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}
