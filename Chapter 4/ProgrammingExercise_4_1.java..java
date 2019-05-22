//Mark Melling, 5-21-2019, this finds the area of a pentagon
import java.util.Scanner;
import java.lang.Math;

class ProgrammingExercise_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//user input for "r"
		System.out.print("Enter the length from the center to the vertex: ");
		double r = input.nextDouble();
		
		
		//getting the area
		double pi = Math.PI;
		double f = Math.sin(pi / 5);	
		double s = ((2 * r) * f);
		double x = (Math.tan(pi / 5)); 
		double y = (Math.pow(s, 2));
		double area = ((5 * y) / (4 * x));
		System.out.print("The area of the pentagon is: " + area);
	}
}