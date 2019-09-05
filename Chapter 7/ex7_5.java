/*Author: Mark Melling
Date: August 28, 2019
This program rules out all numbers that are repeated*/

import java.util.Scanner;
class ex7_5 {
	public static void main(String[] args) {
		System.out.print("Enter 10 numbers separated by a space: ");
		Scanner input = new Scanner(System.in);
		
		int[] jellyArray = new int[10]; 
		int uNumber = 0; //counter variable

		for(int i = 0; i < jellyArray.length; i++) {
			int fish = input.nextInt();
			boolean distinct = true;
			
			for(int c = 0; c < jellyArray.length; c++){
				if(fish == jellyArray[c]){
					distinct = false; // this checks for all numbers in array for duplicates
				}
			}
			
			if(distinct == true) {
				jellyArray[uNumber] = fish;
				uNumber = uNumber + 1;
			}
			
		}
		for(int b = 0; b < uNumber; b++){
			System.out.print(jellyArray[b] + " ");
		}
			System.out.print("The number of distinct numbers is: " + uNumber);
		
	}
}
