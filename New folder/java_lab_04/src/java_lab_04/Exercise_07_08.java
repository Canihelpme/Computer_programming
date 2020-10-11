
/************************************************************************************
* (Average an array) Write two overloaded methods that return the average of an     *
* array with the following headers:                                                 *
* public static int average(int[] array)                                            *
* public static double average(double[] array)                                      *
* Write a test program that prompts the user to enter ten double values, invokes    *
* this method, and displays the average value.                                      *
*************************************************************************************/
package java_lab_04;
import java.util.Scanner;

public class Exercise_07_08 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] int_array = new int[10];
		double [] double_array = new double[10];
		int select;
		
		System.out.println("Enter the number what you want to do: ");
		select = input.nextInt();
		
		if(select == 1)
		{
			System.out.println("The sum of values is: ");
			average(int_array);
		}
		else if(select == 2)
		{
			average(double_array);
		}
	}
	public static int average(int[] array)
	{
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Enter the values: ");
			array[i] = input.nextInt();
		}
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
			result = sum / 10;
		}
		return result;
	}
	public static double average(double[] array)
	{
		double sum = 0;
		double result = 0;
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Enter the values: ");
			array[i] = input.nextDouble();
		}
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
			result = sum / 10;
		}
		return result;
	}
}
