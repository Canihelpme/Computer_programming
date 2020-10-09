package java_lab_01;
import java.util.Scanner;

public class three_point_twelve {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		
		int remains, value, d1, d2, d3;
		value = scanner.nextInt();
		d1 = value / 100;
		remains = value % 100;
		d2 = value / 10;
		remains = value % 10;
		d3 = remains;
		if(d1 ==d3)
			System.out.println(value + " is a palindrome");
		else 
			System.out.println(value + " is not a palindrome");
	}

}
