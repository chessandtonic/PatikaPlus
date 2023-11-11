package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
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