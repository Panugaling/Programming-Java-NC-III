/**
 * This Java program demonstrates the concept of Inheritance.
 * It defines a superclass "Person" with attributes and methods for storing and displaying personal information.
 * The subclass "Student" inherits from "Person" and adds an additional attribute for grade.
 *
 * The program performs the following operations:
 * - Create a Student object with name, age, and grade using a constructor.
 * - Display the student's personal details using the inherited method displayInfo().
 * - Display the student's grade using the displayGrade() method.
 *
 * Concepts Used:
 * - Class and Object
 * - Inheritance (superclass and subclass)
 * - Constructor and constructor chaining (using super())
 * - Instance methods for data manipulation
 */


package Object_oriented_programming;

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student inheriting from Person
class students extends Person {
    char grade;

    // Constructor for Student
    public students(String name, int age, char grade) {
        super(name, age); // Call superclass constructor
        this.grade = grade;
    }

    // Method to display grade
    public void displayGrade() {
        System.out.println("Grade: " + grade);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of Student and setting attributes using constructor
        students student = new students("Alice", 20, 'A');
        // Calling methods to display information
        student.displayInfo();
        student.displayGrade();
    }
}