package java_lab_01;
import java.util.Scanner;

public class three_point_nine {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 9 digits as integer: ");
		int isbn = scanner.nextInt();
		int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, remains;
		
		d1 = isbn / 100000000;
		remains = isbn % 100000000;
		d2 = isbn / 10000000;
		remains = isbn % 10000000;
		d3 = isbn / 1000000;
		remains = isbn % 1000000;
		d4 = isbn / 100000;
		remains = isbn % 100000;
		d5 = isbn / 10000;
		remains = isbn % 10000;
		d6 = isbn / 1000;
		remains = isbn % 1000;
		d7 = isbn / 100000000;
		remains = isbn % 100;
		d8 = isbn / 100000000;
		remains = isbn % 10;
		d9 = remains;
		
		d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
		if(d10 == 10)
			System.out.println("X");
		else
			System.out.println("The ISBN-10 nubmer is "+ isbn + d10);
	}

}
