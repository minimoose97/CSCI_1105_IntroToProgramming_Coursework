/* Author: Mark Melling
   Date: 5/17/2019
   Description:  This program plugs in letters a through f for numbers of the user's decicision.
*/
import java.util.Scanner;

class ProgrammingExercise_3_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		double a = input.nextDouble(); //a
		System.out.print("Enter b:");
		double b = input.nextDouble(); //b
		System.out.print("Enter c:");
		double c = input.nextDouble(); //c
		System.out.print("Enter d:");
		double d = input.nextDouble(); //d
		System.out.print("Enter e:");
		double e = input.nextDouble(); //e
		System.out.print("Enter f:");
		double f = input.nextDouble(); //f
		
		double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		System.out.println("x = " + x);
		
		double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		System.out.println("y = " + y);
		
		double z = ((a * d) - (b * c));
		
		if (z == 0)
			System.out.println("The equation has no solution");
	}
}