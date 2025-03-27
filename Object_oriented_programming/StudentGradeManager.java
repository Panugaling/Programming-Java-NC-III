package Object_oriented_programming;

import java.util.Scanner;

class Student {
    private String name;
    private int[] grades;

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grades = new int[]{grade1, grade2, grade3};
    }

    public Student(String name, int grade1, int grade2, int grade3, int grade4) {
        this.name = name;
        this.grades = new int[]{grade1, grade2, grade3, grade4};
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static String classifyGrade(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 70) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        double average = calculateAverage();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + classifyGrade(average));
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of grades (3 or 4): ");
        int numGrades = scanner.nextInt();

        Student student;

        if (numGrades == 3) {
            System.out.print("Enter 3 grades: ");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();
            student = new Student(name, grade1, grade2, grade3);
        } else {
            System.out.print("Enter 4 grades: ");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();
            int grade4 = scanner.nextInt();
            student = new Student(name, grade1, grade2, grade3, grade4);
        }

        System.out.println();
        student.displayDetails();

        scanner.close();
    }
}
