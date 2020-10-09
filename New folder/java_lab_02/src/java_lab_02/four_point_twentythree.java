package java_lab_02;
import java.util.*;

public class four_point_twentythree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();


		System.out.printf("Employee Name: " + name);
		System.out.printf("Hours Worked: " + hoursWorked);
		System.out.printf("Pay Rate: $" + hourlyPayRate);
		System.out.printf("Gross Pay: $" + (hoursWorked * hourlyPayRate));
		System.out.printf("Deductions:  Federal Witholding (20.0%): $" + ((hoursWorked * hourlyPayRate) * federalTaxRate));
		System.out.printf("State Witholding (9.0%): $" + ((hoursWorked * hourlyPayRate) * stateTaxRate));
		System.out.printf("Total Deduction: $" + (((hoursWorked * hourlyPayRate) * federalTaxRate) + ((hoursWorked * hourlyPayRate) * stateTaxRate)));
		System.out.printf("Net Pay: $" + ((hoursWorked * hourlyPayRate) - ((hoursWorked * hourlyPayRate) * federalTaxRate) + ((hoursWorked * hourlyPayRate) * stateTaxRate)));
	}
}
