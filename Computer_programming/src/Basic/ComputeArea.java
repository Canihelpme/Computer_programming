package Basic;
import java.util.*;


public class ComputeArea {
	public static void main(String[] args)
	{
		double radius;
		double area;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		radius = in.nextDouble();
		//Assign a radius
		if (radius >= 0)
		{
			area = radius * radius * 3.14159;
			System.out.println("The area for the circle of radius " + radius + " is " + area);
		}
		else
		{
			System.out.println("Error");
		}
		
		int num = 10;
		if(num > 10)
		{
			System.out.print("Hello");
		}
	}

}
