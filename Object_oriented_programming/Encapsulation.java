package Object_oriented_programming;

/**
 * This Java program demonstrates the concept of Encapsulation.
 * It defines a class "StudentCMTP" with private attributes and provides
 * public getter and setter methods to access and modify them.
 * The challenge involves:
 * - Creating a StudentCMTP class with encapsulated fields.
 * - Implementing public methods to access and update private data.
 * - Displaying student details using a method.
 */

class StudentCMTP {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentCMTP student = new StudentCMTP();
        student.setName("John Doe");
        student.setAge(20);
        student.displayInfo();
    }
}
