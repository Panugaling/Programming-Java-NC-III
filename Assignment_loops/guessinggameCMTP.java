package Assignment_loops;

import java.util.Random;
import java.util.Scanner;

public class guessinggameCMTP {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(50) + 1;
        int numberOfAttempts = 0;
        int guess = 0;

        System.out.print("Guess a number between 1 and 50:");
        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.print("Too low! Try again: ");
            } else if (guess > numberToGuess) {
                System.out.print("Too high! Try again: ");
            } else {
                System.out.print("Correct! You guessed it in " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }
}
