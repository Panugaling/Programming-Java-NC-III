package Assignment_loops;

import java.util.Scanner;

public class passwordcheckerCMTP {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (!password.equals("java123")) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!password.equals("java123"));

        System.out.println("Access granted!");
        scanner.close();
    }
}
