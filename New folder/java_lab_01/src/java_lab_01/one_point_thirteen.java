package java_lab_01;
import java.util.Scanner;

public class one_point_thirteen {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a : ");
		
		double a = scanner.nextDouble();
		System.out.println("Enter the b : ");
		double b = scanner.nextDouble();
		System.out.println("Enter the c : ");
		double c = scanner.nextDouble();
		System.out.println("Enter the d : ");
		double d = scanner.nextDouble();
		System.out.println("Enter the e : ");
		double e = scanner.nextDouble();
		System.out.println("Enter the f : ");
		double f = scanner.nextDouble();

		double x, y;
		
		if((a*d)-(b*c) <= 0)
			System.out.println("The denominator is wrong");
		/*else if((a*d)-(b*c) < 0)
			System.out.println("The denominator is under 0");
			System.out.println("Enter the other numbers.");
		*/
		else
			System.out.println("x = "+ ((e*d)-(b*f)) / ((a*d)-(b*c)));
			System.out.println("y = "+  ((a*f)-(e*c)) / ((a*d)-(b*c)));
			
	}

}
