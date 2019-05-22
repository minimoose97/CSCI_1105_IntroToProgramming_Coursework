//Mark Melling, May 22, 2019
import java.util.Scanner;

class Ex4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: "); 
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next().toLowerCase();
		
		switch (month) {
		//these are the months
		//31
		case "jan":
		case "mar":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":
			System.out.print("31 days");
			break;
		//30
		case "apr":
		case "jun":
		case "sep":
		case "nov":
			System.out.print("30 days");
			break;
			
		case "feb":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print("29 days");
			} else {
				System.out.print("28 days");
				}
			break;
				
			default:
				System.out.print(" not a month");
			
		}	
	}
}