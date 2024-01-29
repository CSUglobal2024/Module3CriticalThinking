package AvgWithholding;
import java.util.Scanner;

public class AvgWithholding {

	public static void main(String[] args) {
		// Option #1: Calculate Average Withholding
//		Create a program that will calculate the weekly average tax withholding for a customer given the 
//		following weekly income guidelines:
//
//			Income less than $500: tax rate 10%
//			Incomes greater than/equal to $500 and less than $1500: tax rate 15%
//			Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
//			Incomes greater than/equal to $2500: tax rate 30%
//			Compile and submit your pseudocode, source code, and screenshots of the 
//			application executing the application, the results and GIT repository in a single document.
//			
		/*
		 * Plan booleans and comparison operators. Going to need scanner. 
		 * Should I use fixed variables for the tax rates, or just multiply by the respective decimals?
		 * 
		 * Before coding - use git init and make first add and commit, connect to a new repository on my github
		 * Then push. Continue to commit changes regularly with informative commit notes. Decide whether switch statements 
		 * or if else is better. 
		 * 
		 * Step 1. import scanner
		 * Step 2. initialize variable for income input
		 * Step 3. create if/else statement(s) for each income bracket, starting with the smallest
		 * 			and only saying less than the max for each successive bracket, because the branches
		 * 			 will not continue to be read.
		 * Step 3. close scanner to prevent leaks.
		 * 
		 *  - variable for income and tax withholding will be a double as Float runs out of precision to reliably store 
		 *  	values to the cent somewhere in the mid $80k range. Most people do not make 80k a week, but
		 *  	some do.
		 * 
		 * ------EXAMPLE OF SWITCH STMNTS INSTEAD ON IF/ELSE: But cannot use because the ranges are difficult to 
		 * get correct - This cannot calculate between $499 and $500.
		 * // Determine tax rate based on income range using switch statement
        double taxRate;
        switch ((int) income) {
            case 0 ... 499:
                taxRate = 0.10;
                break;
            case 500 ... 1499:
                taxRate = 0.15;
                break;
            case 1500 ... 2499:
                taxRate = 0.20;
                break;
            default:
                taxRate = 0.30;
        }

        // Calculate tax withholding
        double taxWithholding = income * taxRate;
		 */
		Scanner scnr = new Scanner(System.in);
		double income;
		double taxWithholding;
		double taxRate;
		
		System.out.println("Enter customer's gross weekly income in dollars: $");
		
		income = scnr.nextDouble();
		
		if (income < 500) {
			taxRate = 0.10;
		} 
		else if (income < 1500) {
			taxRate = 0.15;
		}
		else if (income < 2500) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		taxWithholding = income * taxRate;
		
		System.out.printf("Tax witholding per week is $%.2f.\n",taxWithholding);
	}

}
