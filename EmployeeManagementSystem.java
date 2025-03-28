/**
 * This Java program implements a Company Employee Management System using inheritance.
 * It models different types of employees in a company and overrides the introduce() method
 * to display relevant details for each role.
 * 
 * The hierarchy is as follows:
 * - Person: Base class with name and age.
 * - Employee: Extends Person, adding job title.
 * - Manager: Extends Employee, adding department.
 * - Executive: Extends Manager, adding company car.
 * 
 * The program demonstrates method overriding and constructor chaining
 * while ensuring proper output formatting.
 */

class PersonA {
    protected String name;
    protected int age;

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Introducing Person:");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class EmployeeB extends PersonA {
    protected String jobTitle;

    public EmployeeB(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public void introduce() {
        System.out.println("Introducing Employee:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle);
    }
}

class ManagerC extends EmployeeB {
    protected String department;

    public ManagerC(String name, int age, String jobTitle, String department) {
        super(name, age, jobTitle);
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("Introducing Manager:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: " + department);
    }
}

class ExecutiveD extends ManagerC {
    protected String companyCar;

    public ExecutiveD(String name, int age, String jobTitle, String department, String companyCar) {
        super(name, age, jobTitle, department);
        this.companyCar = companyCar;
    }

    @Override
    public void introduce() {
        System.out.println("Introducing Executive:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + 
                           ", Department: " + department + ", Company Car: " + companyCar);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        PersonA person = new PersonA("Alice", 30);
        EmployeeB employee = new EmployeeB("Bob", 35, "Software Engineer");
        ManagerC manager = new ManagerC("Charlie", 40, "Project Manager", "IT");
        ExecutiveD executive = new ExecutiveD("Dave", 45, "Senior Executive", "Finance", "BMW X5");

        person.introduce();
        System.out.println();

        employee.introduce();
        System.out.println();

        manager.introduce();
        System.out.println();

        executive.introduce();
    }
}
