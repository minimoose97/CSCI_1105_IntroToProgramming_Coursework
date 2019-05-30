//Mark Melling
import java.util.Scanner;

class ex5_17{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of rows between (1-15) is: ");
		int row = input.nextInt();
		for (int num = 1; num <= row; num++){
			System.out.println("   ");
			
			for (int i = row; i > num; i--){
				System.out.print("   "); //spaces
			}
			for (int k = num; k > 0; k--){ //left side starting at 1 in the middle
				System.out.printf("%3d", k);
			}
			for (int l = 2; l <= num; l++){ //right side starting at 2 next to the middle which is 1
				System.out.printf("%3d", l);
			
			}	
		}
	}		
}