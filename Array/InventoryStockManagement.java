package Array;

import java.util.Scanner;

public class InventoryStockManagement {
    public static void main(String[] args) {
        int[] stock = { 10, 25, 14, 30, 5, 18, 22, 40, 12, 8 };

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nCurrent Stock Levels:");
                displayStock(stock);

                System.out.print("\nEnter the product index to update (0-9): ");
                int index = scanner.nextInt();

                if (index < 0 || index >= stock.length) {
                    System.out.println("Invalid index! Please enter a value between 0 and 9.");
                    continue;
                }

                System.out.print("Enter the new stock value: ");
                int newStock = scanner.nextInt();
                stock[index] = newStock;

                System.out.println("\nUpdated Stock Levels:");
                displayStock(stock);

                int highestStock = stock[0];
                int lowestStock = stock[0];

                for (int i = 1; i < stock.length; i++) {
                    if (stock[i] > highestStock) {
                        highestStock = stock[i];
                    }
                    if (stock[i] < lowestStock) {
                        lowestStock = stock[i];
                    }
                }

                System.out.println("\nHighest Stock: " + highestStock);
                System.out.println("Lowest Stock: " + lowestStock);
            }
        }
    }

    public static void displayStock(int[] stock) {
        for (int i = 0; i < stock.length; i++) {
            System.out.print(stock[i] + (i < stock.length - 1 ? ", " : "\n"));
        }
    }
}
