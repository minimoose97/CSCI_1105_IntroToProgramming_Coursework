/*Author: Mark Melling
Date: September 4, 2019
This program rules out all numbers that are repeated using two methods*/

import java.util.Scanner;
class ex7_15 {
	static int uNumber = 0;
	public static void main(String[] args) {
		System.out.print("Enter 10 numbers separated by a space: ");
		int[] jellyArray = new int[10]; 
		eliminateDuplicates(jellyArray);
		
		for(int b = 0; b < uNumber; b++){
			System.out.print(jellyArray[b] + " ");
		}
	}
			
	public static int[] eliminateDuplicates(int[] jellyArray) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		for(int i = 0; i < jellyArray.length; i++) {
			//int fish = input.nextInt();	
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
		
		System.out.print("The number of distinct numbers is: " + uNumber);
		System.out.println();
		return jellyArray;
	
	}
}
