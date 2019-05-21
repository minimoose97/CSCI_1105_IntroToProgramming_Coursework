//Mark Melling, 5/17/2019, this is about making triangle have sides that are 4, 5, and 6. This is about having the sum of every pair of edges greater than the remaining edge as well.
import java.util.Scanner;

class ProgrammingExercise_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first side of the triangle:");
		double side1 = input.nextDouble();
		
		System.out.println("Enter the second side of the tringle:");
		double side2 = input.nextDouble();
		
		System.out.println("Enter the third side of the tringle:");
		double side3 = input.nextDouble();
			
		double perimeter = (side1 + side2 + side3);
		System.out.println("The perimeter is:" + perimeter);	

		double mixture1 = (side1 + side2);
		//adding side1 and side2
		double mixture2 = (side2 + side3);
		
		double mixture3 = (side3 + side1);
		
		if (mixture1 > side3 && mixture2 > side1 && mixture3 > side2 ){
			System.out.println("The triangle is valid");
		}else{
			System.out.println("The triangle is invalid");

			}
				

	}
}