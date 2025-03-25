package Assignment_loops;

import java.util.Scanner;

public class largestnumberfinderCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            num = scanner.nextInt();

            if (num == -1) break;

            if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + max);
        }

        scanner.close();
    }
}
