/**
 * This Java program implements a grading system using conditional statements.
 * It prompts the user to enter their score and then determines the corresponding grade
 * using if-else-if statements. Additionally, it provides feedback based on the assigned grade.
 */
package conditionStatement;

import java.util.Scanner;

public class GradingSystemCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter your score: ");
        int score = scanner.nextInt(); 
        char grade; 
        String feedback;

        if (score >= 90) {
            grade = 'A';
            feedback = "Excellent!";
        } else if (score >= 75) {
            grade = 'B';
            feedback = "Good job!";
        } else if (score >= 50) {
            grade = 'C';
            feedback = "You can do better!";
        } else {
            grade = 'F';
            feedback = "Needs improvement.";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + feedback);

        scanner.close();
    }
}
