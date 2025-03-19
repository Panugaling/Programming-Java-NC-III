package BMICalculator;

import java.util.Scanner;

public class bmicalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("=== BMI Report ===");
        System.out.printf("Your BMI is: %.2f%n", bmi);

        String healthStatus;

        if (bmi < 18.5) {
            healthStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            healthStatus = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            healthStatus = "Overweight";
        } else {
            healthStatus = "Obese";
        }

        System.out.println("Health Status: " + healthStatus);

        scanner.close();
    }
    
}
