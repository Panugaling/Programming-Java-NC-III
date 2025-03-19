package Assignment_operator_II;

/**
 * This Java program illustrates the functionality of assignment operators.
 * It showcases how variables can be updated using arithmetic operations 
 * combined with assignment operators and displays the results.
 */

public class assignmentOperatorsCMTP {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial value of x: " + x);

        x += 5;
        System.out.println("After adding 5: " + x);

        x -= 3;
        System.out.println("After subtracting 3: " + x);

        x *= 2;
        System.out.println("After multiplying by 2: " + x);

        x /= 4;
        System.out.println("After dividing by 4: " + x);

        x %= 3;
        System.out.println("After finding remainder when divided by 3: " + x);

        double price = 100.0;
        System.out.println("Initial price: $" + price);

        price *= 0.80; // Apply 20% discount
        System.out.println("After 20% discount: $" + price);

        price *= 1.10; // Add 10% tax
        System.out.println("After adding 10% tax: $" + price);
    }
}
