//Mark Melling
import java.util.Scanner;
class Ex6_3 {
	public static void main(String[] args) {
		System.out.print("Type in a number and see if it is a palindrome: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number == reverse(number)){
		System.out.println(number + " is a palindrome");
		}
		else {
		System.out.print(number + " is not a palindrome");
	}//end else
		
	}//end main method
		public static int reverse(int number){
		    int reversed = 0;
		    while(number != 0){
				int remainder = number % 10;
				reversed = reversed * 10 + remainder;
				number = number / 10;
			
		}//end while loop
		return reversed; 
}//end method reverse
		public static boolean isPalindrome(int number){
			
			if(reverse(number) == number){
				return true;
				
		}//end if statement		
		else{
				return false;
								
		}//end else 
		
		}//end ispalindrom method
		

}//end class
