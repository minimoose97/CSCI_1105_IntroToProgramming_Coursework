/* Author: Mark Melling
   Date: May 10, 2019
   Description: This finds the cost of driving by calculating the cost, miles per gallon, and price per gallon.
*/
import java.util.Scanner;

class CostOfDriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: "); //a
		double drivingDistance = input.nextDouble();
		System.out.println("Enter miles per gallon: "); //b
		double milesPerGallon = input.nextDouble();
		System.out.println("Enter price per gallon: "); //c
		double pricePerGallon = input.nextDouble();
		System.out.println("The cost of drive is: "); //d
		double costOfDriving = ((drivingDistance / milesPerGallon) * pricePerGallon);
		
		
		
		System.out.println((drivingDistance / milesPerGallon) * pricePerGallon);	
	}
}

//(a/b)*c=d