//Mark Melling
import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked: ");
		Double numbofhours = input.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		Double hourlyrate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: $");
		Double fedtaxwithholdingrate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: $");
		Double statetaxwithholdingrate = input.nextDouble();
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + numbofhours);
		System.out.println("Pay Rate: $" + hourlyrate);
		System.out.println("Gross Pay: $" + (numbofhours * hourlyrate));
		System.out.println("Deductions: ");
		System.out.println("		Federal Withholding " + (fedtaxwithholdingrate) + ": $" + ((numbofhours * hourlyrate) * fedtaxwithholdingrate));
		System.out.println("		State Withholding " + (statetaxwithholdingrate) + ": $" + ((numbofhours * hourlyrate) * statetaxwithholdingrate));
		System.out.println("		Total Deduction: $" + (((numbofhours * hourlyrate) * fedtaxwithholdingrate) + (numbofhours * hourlyrate) * statetaxwithholdingrate));
		
		System.out.println("Net Pay: $" + ((numbofhours * hourlyrate)-(((numbofhours * hourlyrate) * fedtaxwithholdingrate) + (numbofhours * hourlyrate) * statetaxwithholdingrate)));
		
	}
}