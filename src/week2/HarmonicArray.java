package week2;

import java.util.Scanner;

public class HarmonicArray {
    public static void main(String[] args) {
        // Declare an array and assign values to it
        double[] array = {48, 75, 8, 23, 7, 29, 11};

        // Calculate the harmonic sum
        double harmonicSum = 0;

        for (int i = 0; i < array.length; i++) {
            harmonicSum += 1.0 / array[i];
        }
        // Calculate the harmonic mean
        double harmonicMean = array.length / harmonicSum;

        System.out.println("Harmonic mean: " + harmonicMean);
    }
}

