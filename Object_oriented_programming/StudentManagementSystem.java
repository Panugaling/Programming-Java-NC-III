package Object_oriented_programming;

import java.util.ArrayList;
import java.util.Scanner;

class Students {
    private String name;
    private int id;
    private double grade;
    
    public Students(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    
    public int getId() {
        return id;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

public class StudentManagementSystem {
    private static ArrayList<Students> studentList = new ArrayList<>();
    private static final String SCHOOL_NAME = "Greenwood High School";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nWelcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentGrade(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
    
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();
        
        studentList.add(new Students(name, id, grade));
        System.out.println("Student added successfully!");
    }
    
    private static void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }
        
        System.out.println("--- Student Records ---");
        System.out.println("School: " + SCHOOL_NAME);
        
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            studentList.get(i).displayStudent();
        }
    }
    
    private static void updateStudentGrade(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        for (Students student : studentList) {
            if (student.getId() == id) {
                System.out.print("Enter new grade: ");
                double newGrade = scanner.nextDouble();
                scanner.nextLine();
                student.setGrade(newGrade);
                System.out.println("Grade updated successfully!");
                return;
            }
        }
        
        System.out.println("Student ID not found.");
    }
}
