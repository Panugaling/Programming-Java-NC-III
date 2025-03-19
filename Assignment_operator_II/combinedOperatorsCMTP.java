package Assignment_operator_II;

/**
 * This program demonstrates the use of logical and assignment operators in Java.
 * Initialize two integer variables int a = 5 and int b - 10,
 * It checks whether two numbers are positive and, if so, modifies their values using assignment operators.
 * Then print the final values of a and b
 */
public class combinedOperatorsCMTP {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > 0 && b > 0) {
            a += b;  
            b = a * 2; 
        }

        System.out.println("Final value of a: " + a);
        System.out.println("Final value of b: " + b);
    }
}
