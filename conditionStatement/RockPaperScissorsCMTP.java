/**
 * This Java program simulates a Rock, Paper, Scissors game where the user plays against the computer.
 * The user selects Rock (R), Paper (P), or Scissors (S), and the computer randomly chooses one of the three.
 * The program then determines the winner based on the game rules using conditional statements.
 */
package conditionStatement;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your choice (R for Rock, P for Paper, S for Scissors): ");
        char userChoice = scanner.next().toUpperCase().charAt(0); 

        char[] choices = {'R', 'P', 'S'};
        char computerChoice = choices[random.nextInt(3)]; 

        System.out.println("Computer chose: " + computerChoice);

        switch (userChoice) {
            case 'R':
                if (computerChoice == 'S') {
                    System.out.println("You win!");
                } else if (computerChoice == 'P') {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            case 'P':
                if (computerChoice == 'R') {
                    System.out.println("You win!");
                } else if (computerChoice == 'S') {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            case 'S':
                if (computerChoice == 'P') {
                    System.out.println("You win!");
                } else if (computerChoice == 'R') {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            default:
                System.out.println("Invalid input. Please enter R, P, or S.");
        }

        scanner.close();
    }
}
