//Mark Melling
import java.util.Scanner;
class Ex5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

				System.out.println("Loop that is divisible by 5 and 6 but not just both at the same time only: ");
				int num = (100);
				
				while (num >= 100 && num <= 200){ 
				 if (num % 5 == 0 ^ num % 6 == 0)
					System.out.print((num + ", "));
					num += 1;
					
				}	
			
		        			
		
	}
}