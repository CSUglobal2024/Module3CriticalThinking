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
		 * Then push. Continue to commit changes regularly with informative commit notes.
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
		 * - 
		 */
		Scanner scnr = new Scanner(System.in);
		double income;
		double taxWithholding;
		System.out.println("Enter customer's gross weekly income in dollars: $");
		
		income = scnr.nextInt();
		
		if (income < 500) {
			taxWithholding = income * 0.10;
		} 
		else if (income < 1500) {
			taxWithholding = income * 0.15;
		}
		else if (income < 2500) {
			taxWithholding = income * 0.20;
		}
		else {
			taxWithholding = income * 0.30;
		}
		
		System.out.println("Tax witholding per week is " + taxWithholding + ". ");
	}

}
