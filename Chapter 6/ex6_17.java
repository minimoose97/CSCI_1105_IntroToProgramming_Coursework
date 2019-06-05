//Mark Melling
import java.util.Scanner;

class ex6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many rows and columns in one number? ");
			int rc = input.nextInt();
			
			printMatrix(rc);
	}//end main method
	public static void printMatrix(int rc){
		
			for(int r = 1; r <= rc; r++){
				//rows which is = how many rows
				for(int c = 1; c <= rc; c++){ // columns
					System.out.print((int)(Math.random() * 2));
				
				}//end second for loop
				System.out.println();
			}//end first for loop
			
	}//end printmatrix method
}//end class