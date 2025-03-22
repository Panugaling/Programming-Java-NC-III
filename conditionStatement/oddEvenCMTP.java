/**
 * This Java program determines whether a given number is odd or even.
 * It prompts the user to enter an integer and uses the modulus operator (%)
 * along with an if-else statement to check divisibility by 2.
 * The program then displays whether the number is even or odd.
 */
package conditionStatement;

import java.util.Scanner;

public class oddEvenCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 

        if (num % 2 == 0) {
            System.out.print(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        scanner.close(); 
    }
}
