package java_lab_01;
import java.util.Scanner;

public class three_point_eighteen {
	public static void main(String [] args)
	{
		double weight, cost1, cost2, cost3, cost4;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight of the package: ");
		
		weight = scanner.nextDouble();
		cost1 = 3.5;
		cost2 = 5.5;
		cost3 = 8.5;
		cost4 = 10.5;
		
		if(weight > 50)
			System.out.println("The package cannot be shipped.");
		else if(weight>0 && weight <= 1)
			System.out.println("Shipping cost of package is $"+ cost1*weight);
		else if(weight <= 3)
			System.out.println("Shipping cost of package is $"+ cost2*weight);
		else if(weight <= 10)
			System.out.println("Shipping cost of package is $"+ cost3*weight);
		else if(weight <= 20)
			System.out.println("Shipping cost of package is $"+ cost4*weight);
	}
}
