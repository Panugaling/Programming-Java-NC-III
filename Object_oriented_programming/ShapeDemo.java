
/**
 * This Java program implements a simple Shape hierarchy using abstraction.
 * It defines an abstract class Shape with an abstract method area(), which is 
 * implemented by its subclasses Circle and Rectangle.
 * 
 * The hierarchy is as follows:
 * - Shape: Abstract base class with an abstract method area().
 * - Circle: Extends Shape, calculates the area using the formula π * r^2.
 * - Rectangle: Extends Shape, calculates the area using the formula length * width.
 * 
 * The program demonstrates abstraction and method overriding while ensuring proper output formatting.
 */


package Object_oriented_programming;

 abstract class Shape {
    abstract double area();
}

class Circle implements  Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return 3.14159 * radius * radius; // Approximating π as 3.14159
    }
}

class Rectangle implements  Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(10.0, 5.0);
        
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
