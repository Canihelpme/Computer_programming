/*
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(
double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
*/
package java_lab_04;

import java.util.Scanner;

public class Exercise_06_05 
{
	public static void main(String [] args)
	{
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the number1: ");
		double num2 = input.nextDouble();
		System.out.println("Enter the number1: ");
		double num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		double temp;
		if(num1 > num2 && num2 < num3)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if(num3 < num1 && num3 < num2)
		{
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num3 < num2) 
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("The sorted result is: "+num1+" ,"+num2+" ,"+num3);
	}
}
