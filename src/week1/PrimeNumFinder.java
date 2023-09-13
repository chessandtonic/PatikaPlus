package week1;

// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.

public class PrimeNumFinder {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // Function to check if a given number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) { // We only need to check up to the square root of the number
            if (number % i == 0) {
                return false; // If the number is divisible by another number, it's not prime
            }
        }
        return true; // If it passes the above conditions, the number is prime
    }
}