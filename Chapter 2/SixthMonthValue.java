/* Author: Mark Melling
   Date: May 10, 2019
   Discription: This finds the balance of the sixth month when a person saves a certain amount of money in their savings account having a monthly interest rate of 5%.
*/
import java.util.Scanner;

class SixthMonthValue {
	public static void main(String[] args) {
		//Creating Scanner for Monthly Savings
		Scanner input = new Scanner(System.in);
		
		//Entering balance info
		//double balance = (monthlySavings + balance) * (1 + 0.00417);
		double balance = 0;
		//Enter amount of Monthly Savings
		System.out.print("Enter amount of Monthly Savings: ");
		double monthlySavings = input.nextDouble();
		balance = (monthlySavings + balance) * (1 + 0.00417);
		
		System.out.println(balance); //displays 100.417
		balance = (monthlySavings + balance) * (1 + 0.00417);
		System.out.println(balance); //displays 201.252
		balance = (monthlySavings + balance) * (1 + 0.00417);
		System.out.println(balance); //displays 302.507
		balance = (monthlySavings + balance) * (1 + 0.00417);
		System.out.println(balance); 
		balance = (monthlySavings + balance) * (1 + 0.00417);
		System.out.println(balance);
		balance = (monthlySavings + balance) * (1 + 0.00417);
		System.out.println(balance);
		balance = (monthlySavings + balance) * (1 + 0.00417);
	}
}	