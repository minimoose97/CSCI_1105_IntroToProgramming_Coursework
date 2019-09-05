/*Author: Mark Melling
Date: September 5, 2019
this program determines which lockers are open.
*/
class ex7_23 {
	
	public static void main(String[] args) {
		boolean[] locker = new boolean[100];
		
		for (int s = 1; s <= 100; s++){
			
			for (int l = s - 1; l < 100; l += s){
			
				locker[l] = !locker[l];
				/*
				if (locker[l] == true) 
					locker[l] = false;
				else 
					locker[l] = true;
				*/
			}
		}
		
		for(int a = 0; a < 100; a++){
			if (locker[a] == true){
				System.out.print("Locker " + (a + 1) + ", ");
			}
		}
	}
}