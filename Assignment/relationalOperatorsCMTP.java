package Assignment; 

// This program demonstrates the use of relational operators in Java.
// It compares two integers, x and y, using various relational operators
// and prints the results. Additionally, it checks if x is within a specified range.

public class relationalOperatorsCMTP {
    public static void main(String[] args) { 
        int x = 60;
        int y = 10;

        
        System.out.println("x == y: " + (x == y)); 
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y)); 
        System.out.println("x < y: " + (x < y)); 
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y)); 

        
        int lowerBound = 10; 
        int upperBound = 50; 

        
        if (x >= lowerBound && x <= upperBound) {
            System.out.println("x is within the range " + lowerBound + " and " + upperBound);
        } else {
            System.out.println("x is not within the range " + lowerBound + " and " + upperBound);
        }
    }
}
