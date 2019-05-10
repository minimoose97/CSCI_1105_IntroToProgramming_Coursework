/* Author: Mark Melling
   Date: May 10, 2019
   Discription: This code converts Celsius to Fahrenheit
*/
import java.util.Scanner;
public class CelsiusToFahrenheit { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a degree in Celsius: ");
		double Celsius = input.nextDouble(); 
		// Convert Celsius to Fahrenheit
		double fahrenheit = (9.0 / 5) * Celsius + 32.0; 
		System.out.println("Celsius " + Celsius + " is " +
		fahrenheit + " in Fahrenheit");
	}	
}