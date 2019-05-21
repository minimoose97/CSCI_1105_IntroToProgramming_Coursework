//Mark Melling, 5/17/2019, making sure that the point is in the rectangle
import java.util.Scanner;

class ProgrammingExercise_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the x value:");
		double x_value = input.nextDouble();
		
		System.out.println("Enter the y value:");
		double y_value = input.nextDouble();
			
		System.out.println("Point" + "(" + x_value + "," + y_value + ")");
		

		if (y_value > 2.5 || y_value < -2.5 || x_value > 5 || x_value < -5){
			System.out.println("Point" + "(" + x_value + "," + y_value + ")" + "is not in the rectangle");
		}else{
			System.out.println("Point" + "(" + x_value + "," + y_value + ")" + "is in the rectangle");

			}
				

	}
}