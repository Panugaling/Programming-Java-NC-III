package Array;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] accountBalances = {10000, 7500, 5000, 12000, 3000};

        System.out.println("Available accounts:");
        for (int i = 0; i < accountBalances.length; i++) {
            System.out.println("[" + i + "] Account " + (i + 1));
        }

        System.out.print("\nEnter account index (0-4): ");
        int accountIndex = scanner.nextInt();

        if (accountIndex < 0 || accountIndex >= accountBalances.length) {
            System.out.println("Invalid account index!");
            scanner.close();
            return;
        }

        System.out.println("Current balance: " + accountBalances[accountIndex]);

        System.out.print("\nEnter transaction type (1-Withdraw, 2-Deposit): ");
        int transactionType = scanner.nextInt();

        if (transactionType == 1) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount > accountBalances[accountIndex]) {
                System.out.println("Insufficient balance!");
            } else if (amount <= 0) {
                System.out.println("Invalid amount!");
            } else {
                accountBalances[accountIndex] -= amount;
                System.out.println("Transaction successful!");
                System.out.println("New balance: " + accountBalances[accountIndex]);
            }
        } else if (transactionType == 2) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount!");
            } else {
                accountBalances[accountIndex] += amount;
                System.out.println("Transaction successful!");
                System.out.println("New balance: " + accountBalances[accountIndex]);
            }
        } else {
            System.out.println("Invalid transaction type!");
        }

        scanner.close();
    }
}
