package Assignment_loops;

import java.util.Scanner;

public class sumofnumbersCMTP {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int sum = 0, i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}
