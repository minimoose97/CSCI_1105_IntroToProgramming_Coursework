//Mark Melling
import java.util.Scanner;
class Ex5_49/cCCC{
	public static void main(String[] args) {
		Scanner input = new Scanner(System. in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int vowels = 0, consonants = 0;
		s = s.toUpperCase();
		for(int i = 0; i < s.length(); ++i)
		{
			char ch = s.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			++vowels;		
			}
			else if((ch >= 'A' && ch <= 'Z')) {
			++consonants;
			}
		}
		System.out.println("You have " + vowels + " vowels.");
		System.out.println("You have " + consonants + " consonants.");
	}
}