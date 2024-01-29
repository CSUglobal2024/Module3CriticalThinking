package AvgWithholding;

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
		 * Plan booleans and comparison operators. Going to need scanner. Should I use switch statement or
		 * if else for the logic to compare input to tax brackets?
		 * Should I use fixed variables for the tax rates?
		 * 
		 * Step 1. import scanner
		 * Step 2. initialize variable for income input
		 * Step 3. create switch statement(s) for each income bracket, starting with the smallest
		 * 			and only saying less than the max for each successive bracket, because the branches
		 * 			 will not continue to be read with switch statements that have breaks. Might be better 
		 * 			than if/else.
		 * Step 3. close scanner to prevent leaks.
		 */
	}

}
