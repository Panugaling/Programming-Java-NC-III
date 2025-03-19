package Assignment;

// This program demonstrates the use of the modulus operator in Java.
// It calculates the remainder of division between two numbers
// and checks if one number is divisible by another.

public class modulusOperatorCMTP {
    public static void main(String[] args) { 
        int num1 = 25;
        int num2 = 4;
        int remainder = num1 % num2; 
        System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + remainder); 

        int num3 = 18;
        int num4 = 6;

        if (num3 % num4 == 0) {
            System.out.println(num3 + " is divisible by " + num4);
        } else {
            System.out.println(num3 + " is not divisible by " + num4);
        }
    }
}
