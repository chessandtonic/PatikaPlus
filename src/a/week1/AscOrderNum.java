package a.week1;
import java.util.Scanner;
public class AscOrderNum {
    public static void ascOrder(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz: ");
        a = input.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("3.sayıyı giriniz: ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("1.sayı < 2.sayı < 3.sayı");
            } else {
                System.out.println("1.sayı < 3.sayı < 2.sayı");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("2.sayı < 1.sayı < 3.sayı");
            } else {
                System.out.println("2.sayı < 3.sayı < 1.sayı");
            }
        } else if ((c < b) && (c < a)) {
            if (a < b) {
                System.out.println("3.sayı < 1.sayı < 2.sayı");
            } else {
                System.out.println("3.sayı < 2.sayı < 1.sayı");
            }
        }
    }
}
