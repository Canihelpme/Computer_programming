package java_lab_01;
import java.util.Scanner;

public class two_point_two {
	public static void main(String [] args) {
		double area, radius, volume, length;
		
		Scanner input = new Scanner(System.in);
		final double pi = 3.141592;
		
		System.out.println("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		area = radius * radius * pi;
		volume = area * length;
		
		System.out.println("The area is "+ area);
		System.out.println("The volume is "+ volume);
	}

}
