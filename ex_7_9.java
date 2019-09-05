/*Author: Mark Melling
Date: August 30, 2019
this code finds the smallest number in the array
*/
import java.util.Scanner;

class ex_7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter EXACTLY 10 decimal numbers separated by a space: ");
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++){
			array[i] = input.nextDouble();
		}
		System.out.print("Smallest number is " + min(array));
		
	}
	
	public static double min(double[] array) {
		
		double smallest = array[0]; 
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallest) 
			smallest = array[i];
			
			
		}
	
		return smallest; 
		}
}
