
package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

import java.util.Scanner;

public class SinifGecme {
    static Scanner scanner = new Scanner(System.in);
    static String[] courses = {"Fizik", "Mat", "Türkçe", "Kimya", "Müzik"};

    public static void main(String[] args) {
        float avg = 0.0f;
        int numCourses = courses.length;

        System.out.println("Lütfen notlarınızı giriniz:");

        for (int c = 0; c < numCourses; c++) {
            System.out.println(courses[c] + " notu:");
            float grade = scanner.nextFloat();

            if (grade < 0 || grade > 100) {
                continue;
            }
            avg += grade;
        }

        avg /= numCourses;

        System.out.println(avg >= 55 ? "Sınıfı geçtiniz!" : "Sınıfta kaldınız.");
    }
}