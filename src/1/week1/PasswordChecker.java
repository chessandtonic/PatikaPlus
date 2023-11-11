package week1;

import java.util.Scanner;
// Arkadaşlar selam, kodu test etmek için PatikaPlus altında bulabileceğiniz Main.java programını kullanabilirsiniz.
// Temelde Main.java'da olduğu gibi bu programı başka bir main method'u ile çağırarak çalıştırabilirsiniz.
public class PasswordChecker {
    public static void passCheck() {
        Scanner scanner = new Scanner(System.in);

        // Define the correct username and password
        String correctUsername = "patika";
        String correctPassword = "Java123";

        int attempts = 3; // Number of login attempts allowed

        while (attempts > 0) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome, " + username + "!");
                break; // Exit the loop if the credentials are correct
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect username or password. You have " + attempts + " attempts remaining.");
                } else {
                    System.out.println("Incorrect username or password. You have no attempts remaining.");

                    // Ask the user if they want to change their password
                    System.out.print("Do you want to change your password? (yes/no): ");
                    String changePasswordChoice = scanner.nextLine();

                    if (changePasswordChoice.equalsIgnoreCase("yes")) {
                        boolean passwordChanged = false;
                        while (!passwordChanged) {
                            System.out.print("Enter a new password: ");
                            String newPassword = scanner.nextLine();

                            // Check if the new password is the same as the original password
                            if (newPassword.equals(correctPassword)) {
                                System.out.println("New password cannot be the same as the original password.");
                            } else {
                                correctPassword = newPassword;
                                System.out.println("Password changed successfully!");
                                passwordChanged = true;
                            }
                        }
                    } else {
                        System.out.println("Goodbye!");
                    }
                }
            }
        }
        scanner.close();
    }
}