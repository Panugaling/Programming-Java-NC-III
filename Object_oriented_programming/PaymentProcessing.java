/**
 * This Java program implements a payment processing system using interfaces and polymorphism.
 * It defines a PaymentMethod interface with a method processPayment(double amount).
 * Three classes (CreditCard, PayPal, and CryptoWallet) implement this interface, 
 * each providing its own payment processing logic.
 * 
 * The main class, PaymentProcessing, prompts the user to select a payment method, 
 * enters the payment amount, and then processes the payment dynamically using polymorphism.
 */

package Object_oriented_programming;

import java.util.Scanner;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class CryptoWallet implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose payment method (1: Credit Card, 2: PayPal, 3: Crypto Wallet): ");
        int choice = scanner.nextInt();

        PaymentMethod payment = null;

        switch (choice) {
            case 1:
                payment = new CreditCard();
                break;
            case 2:
                payment = new PayPal();
                break;
            case 3:
                payment = new CryptoWallet();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        System.out.print("Enter the payment amount: ");
        double amount = scanner.nextDouble();

        payment.processPayment(amount);

        scanner.close();
    }
}

