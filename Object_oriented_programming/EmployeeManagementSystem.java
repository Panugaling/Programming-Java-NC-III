/**
 * This Java program implements an Employee Payroll Management System.
 * It allows users to perform the following operations:
 * - Add Employee: Enter and store employee details such as name, ID, salary, and department.
 * - View All Employees: Display all stored employee records.
 * - Calculate Annual Salary: Compute and display an employee's annual salary (monthly salary * 12).
 * - Give Salary Raise: Update an employee's salary by a specified percentage.
 * - Exit: Close the program.
 *
 * The program uses:
 * - A class "Employee" with attributes, constructors, and instance methods for data manipulation.
 * - A menu-driven approach for user interaction.
 * - An ArrayList to store employee records dynamically.
 */
package Object_oriented_programming;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int employeeID;
    private double salary;
    private String department;

    public Employee() {
        this.name = "Unknown";
        this.employeeID = 0;
        this.salary = 0.0;
        this.department = "Not Assigned";
    }

    public Employee(String name, int employeeID, double salary, String department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Department: " + department);
        System.out.println();
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percentage) {
        this.salary += (salary * percentage / 100);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nWelcome to the Employee Payroll Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    calculateAnnualSalary();
                    break;
                case 4:
                    giveSalaryRaise();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        employees.add(new Employee(name, id, salary, department));
        System.out.println("Employee added successfully!");
    }

    private static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\n--- Employee Records ---");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }

    private static void calculateAnnualSalary() {
        System.out.print("Enter employee ID to calculate salary: ");
        int id = scanner.nextInt();
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == id) {
                System.out.println("Annual Salary of " + emp.getName() + ": $" + String.format("%.2f", emp.calculateAnnualSalary()));
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private static void giveSalaryRaise() {
        System.out.print("Enter employee ID to raise salary: ");
        int id = scanner.nextInt();
        System.out.print("Enter percentage increase: ");
        double percentage = scanner.nextDouble();

        for (Employee emp : employees) {
            if (emp.getEmployeeID() == id) {
                emp.raiseSalary(percentage);
                System.out.println("Salary updated successfully! New Salary: $" + String.format("%.2f", emp.getSalary()));
                return;
            }
        }
        System.out.println("Employee not found!");
    }
}