package Assignment_operator_II;

/**
 * This program illustrates the functionality of logical operators in Java.  
 * It demonstrates the use of AND (&&), OR (||), and NOT (!) operators with boolean values.  
 * Furthermore, it evaluates loan eligibility based on predefined credit score  
 * and annual income criteria.
 */

public class logicalOperatorsCMTP {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));

        // Loan eligibility check
        int creditScore = 735;
        int annualIncome = 55500;

        boolean isEligibleForLoan = (creditScore > 700) && (annualIncome > 50000);
        System.out.println("Loan eligibility: " + isEligibleForLoan);
    }
}
