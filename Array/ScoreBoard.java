/**
 * This program collects and processes student scores using a two-dimensional array.
 * It allows the user to input scores for multiple students across multiple subjects.
 * The program then calculates and displays each student's total and average score,
 * as well as the overall sum of all scores.
 * Prompt the user to enter the number of students and subjects.
 * These values determine the size of the 2D array.
 * Declare and initialize a 2D array to store student scores.
 * The rows represent students, and the columns represent subjects.
 * Collect scores from the user for each student and each subject.
 * The outer loop iterates through students, while the inner loop iterates through subjects.
 * Display the collected scores in a structured matrix format.
 * Each row corresponds to a student, and each column represents their scores across subjects.
 * Display the collected scores in a structured matrix format.
 * Each row corresponds to a student, and each column represents their scores across subjects.
 * Calculate and display the total and average score for each student.
 * The total is the sum of all subject scores, and the average is computed accordingly.
 * The grandTotal accumulates the scores of all students for final summary.
 * Display the total sum of all scores across all students and subjects.
 */

package Array;

import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[][] scores = new int[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter scores for Student " + (i + 1) + ": ");
            for (int j = 0; j < numSubjects; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nStudent Scores Matrix:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }

        int grandTotal = 0;
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += scores[i][j];
            }
            double average = (double) total / numSubjects;
            grandTotal += total;
            System.out.printf("Student %d - Total: %d, Average: %.2f%n", (i + 1), total, average);
        }

        System.out.println("\nTotal Sum of All Scores: " + grandTotal);

        scanner.close();
    }
}
