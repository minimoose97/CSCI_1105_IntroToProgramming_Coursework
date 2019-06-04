//Mark Melling
import java.util.Scanner;
class Ex6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type in a number: ");
		int number = input.nextInt();
		System.out.print("Type in a width number: ");
		int width = input.nextInt();
		
		System.out.print((format(number, width)) + number);
	}
	
	public static String format(int number, int width){
		
		 String number1 = " " + number;
		 String width1 = "";
		 
		
			for(int b = 1; b <= width - 2; b++){
				System.out.print((int)(Math.random()) * 2);
			}
			
		
		return width1;
	
			}
}