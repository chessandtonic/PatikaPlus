package week1;

import java.util.Scanner;
public class BMICalculator {
    public static void calculate() {
        float boy, index;
        int kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meters:");
        boy = input.nextFloat();
        System.out.println("Please enter your weight in kilograms:");
        kilo = input.nextInt();

        index = kilo / (boy * boy);
        System.out.println("Your BMI is: " + index);
    }
}