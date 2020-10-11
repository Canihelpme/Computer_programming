/*********************************************************************************
* (Find the smallest element) Write a method that finds the smallest element in  *
* an array of double values using the following header:                          *
* public static double min(double[] array)                                       *
* Write a test program that prompts the user to enter ten numbers, invokes this  *
* method to return the minimum value, and displays the minimum value.            *
*********************************************************************************/
package java_lab_04;
import java.util.Scanner;

public class Exercise_07_09 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double [] array = new double[10];
		
		System.out.println("Enter ten numbers: ");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = input.nextDouble();
		}
		min(array);
	}
	public static double min(double[] array)
	{
		double result = array[0];
		
		for(int i = 0; i < array.length - 1; i++)
		{
			if(array[i] > array[i + 1])
			{
				result = array[i + 1];
			}
		}
		System.out.println("The minimum number is: "+result);
		return result;
	}
}
