/**
 * This Java program demonstrates the concept of Encapsulation in a banking system.
 * It defines a class "BankAccount" with private attributes and provides
 * public methods to access and modify them securely.
 * 
 * The challenge involves:
 * - Creating a `BankAccount` class with encapsulated fields.
 * - Implementing public getter and setter methods with validation.
 * - Managing transaction history to track deposits and withdrawals.
 * - Applying interest calculation based on the account balance.
 * - Implementing a menu-driven system for user interaction.
 * 
 * Flow of the Program:
 * 1. The user is presented with a **menu-driven system**.
 * 2. They can **create an account**, where the system validates the input.
 * 3. They can **view account details** securely using getter methods.
 * 4. The program allows **depositing money**, ensuring that the deposit amount is valid.
 * 5. The user can **withdraw money**, but only if they have sufficient balance.
 * 6. Interest can be applied based on the **annual interest rate**.
 * 7. The user can **view transaction history**, which tracks deposits, withdrawals, and interest applications.
 * 8. The user can **exit the program**, securely closing the Scanner.
 * 
 * Estimated Time of Completion: 3 hours
 */
package Object_oriented_programming;

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;
    private ArrayList<String> transactionHistory;

    public BankAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        if (!accountNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Account number must be exactly 10 digits.");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Account created with initial deposit: $" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposit: $" + amount);
        System.out.println("Deposit successful. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: $" + amount);
        System.out.println("Withdrawal successful. New Balance: $" + balance);
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        transactionHistory.add("Interest Applied: $" + interest);
        System.out.println("Interest applied. New Balance: $" + balance);
    }

    public void viewTransactionHistory() {
        System.out.println("--- Transaction History ---");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public void displayAccountDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class SecureBankingSystem {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to the Secure Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> viewAccount();
                case 3 -> depositMoney();
                case 4 -> withdrawMoney();
                case 5 -> applyInterest();
                case 6 -> viewTransactionHistory();
                case 7 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter Account Number (10 digits): ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = scanner.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        try {
            BankAccount newAccount = new BankAccount(accountNumber, accountHolder, initialDeposit, interestRate);
            accounts.add(newAccount);
            System.out.println("Account created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    private static void viewAccount() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void depositMoney() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void applyInterest() {
        for (BankAccount account : accounts) {
            account.applyInterest();
        }
    }

    private static void viewTransactionHistory() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.viewTransactionHistory();
        } else {
            System.out.println("Account not found.");
        }
    }
}
