//Mark Melling
import java.util.Scanner;
class Ex6_37_ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type in a number: ");
		int number = input.nextInt();
		System.out.print("Type in a width number: ");
		int width = input.nextInt();
		
		System.out.print(format(number, width));
	}
	
	public static String format(int number, int width){
		
		String number2 = "";
		String number1 = "" + number;
		for(int b = 0; b < width - number1.length(); b++){
			number2 = number2 + "0";
			
		}
		number2 = number2 + number1;
		return number2;
	}
}