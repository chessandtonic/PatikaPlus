package a.week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class EventSuggest {
    public static void suggest() {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius: ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go skiing!");
        } else if (temperature >= 5 && temperature <=25) {
            if (temperature < 15) {
                System.out.println("You can go to the movies!");
            } else if (temperature == 15){
                System.out.println("You can go to the movies or to a picnic!");
            } else {
                System.out.println("You can go to a picnic!");
            }
        } else {
            System.out.println("You can go swimming!");
        }
    }
}

