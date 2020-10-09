package java_lab_01;
import java.util.Scanner;

public class three_point_one {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a,b,c");
		double a, b, c;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		double r1, r2, x;
		x = b*b - 4*a*c;
		
		r1 = ((-b + Math.pow(x, 0.5)) / (2*a));
		r2 =((-b - Math.pow(x, 0.5)) / (2*a)) ;
		
		if(x == 0)
			System.out.println("The equation has one root "+ -b);
		else if(x > 0)
			System.out.println("The two roots are "+ r1 +" and " + r2);
		else
			System.out.println("No real root");

	}
}
