package Number_system_converter1;

import java.util.Scanner;

public class manualnumberconverterCMTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binary = convertToBase(decimal, 2);
        String octal = convertToBase(decimal, 8);
        String hexadecimal = convertToBase(decimal, 16).toUpperCase();
        
        System.out.println("\n=== Number System Conversions ===");
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        
        scanner.close();
    }

    public static String convertToBase(int num, int base) {
        if (num == 0) return "0";
        
        String result = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            int remainder = num % base;
            result = hexChars[remainder] + result;
            num /= base;
        }
        
        return result;
    }
}
