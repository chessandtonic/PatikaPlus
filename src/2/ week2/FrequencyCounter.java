package week2;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 4, 4, 4};

        for (int i = 0; i < array.length; i++) {
            int count = 1; // Initialize the count to 1 for the current element
            if (array[i] == -1) {
                continue; // Skip if this element has been counted before
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = -1; // Mark the element as counted
                }
            }
            System.out.println("Element " + "'"+ array[i] + "'" + " appeared " + count + " times.");
        }
    }
}
