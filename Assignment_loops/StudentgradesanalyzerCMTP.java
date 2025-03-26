package Assignment_loops;

import java.util.Scanner;

public class StudentgradesanalyzerCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / numberOfStudents;

        System.out.println("\n=== Grade Analysis ===");
        System.out.println("Total Grades: " + sum);
        System.out.println("Average Grade: " + String.format("%.2f", average));
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}
