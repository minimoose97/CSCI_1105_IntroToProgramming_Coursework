//Mark Melling
import java.util.Scanner;
class Ex6_25 {
	public static void main(String[] args) {
		System.out.print("Type in a number in milliseconds: ");
		Scanner input = new Scanner(System.in);
		
		long millis = input.nextLong();
		
		String i = convertMillis(millis);
		
		System.out.println("Conversion is " + i);
 		
		
	}
	
	public static String convertMillis(long millis){
		
		long totalSeconds = (millis / 1000);
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		String k = currentHour + ":" + currentMinute + ":" + currentSecond;
		
		return k;
	
			}
}