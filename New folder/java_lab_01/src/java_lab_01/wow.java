package java_lab_01;

import java.util.Scanner;

public class wow {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter values for a, b and c.
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		
		double x = b*b - 4 * a * c;

		
		System.out.print("The equation has ");
		if (x > 0)
		{
			double root1 = (-b + Math.pow(x, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(x, 0.5)) / (2 * a);  
			System.out.println("two roots " + root1 + " and " + root2);
		}
		else if (x == 0)
		{
			double root1 = (-b + Math.pow(x, 0.5)) / (2 * a);
			System.out.println("one root " + root1);
		}
		else
			System.out.println("no real roots");
	}
}