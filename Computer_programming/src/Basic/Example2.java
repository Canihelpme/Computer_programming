package Basic;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args)
	{
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		radius = input.nextDouble();
		System.out.println("User entered "+ radius);
		
		area = radius * radius * 3.141592;
		
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
	}

}
