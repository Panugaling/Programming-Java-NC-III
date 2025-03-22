/**
 * This Java program calculates the electricity bill based on the number of units consumed.
 * It applies different billing rates using conditional statements:
 * - First 100 units are charged at 1.50 per unit.
 * - Next 200 units (101-300) are charged at 2.50 per unit.
 * - Beyond 300 units, the rate is 3.50 per unit.
 * and ensures accurate bill computation based on usage.
 */
package conditionStatement;

import java.util.Scanner;

public class ElectricityBillCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt(); 
        double bill = 0; 

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            bill = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 3.50);
        }

        System.out.println("Total bill: " + bill);

        scanner.close(); 
    }
}
