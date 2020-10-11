/*********************************************************************************
* (Find the index of the smallest element) Write a method that returns the index *
* of the smallest element in an array of integers. If the number of such elements* 
* is greater than 1, return the smallest index. Use the following header:        *
* public static int indexOfSmallestElement(double[] array)                       *
* Write a test program that prompts the user to enter ten numbers, invokes this  *
* method to return the index of the smallest element, and displays the index.    *
*********************************************************************************/
package java_lab_04;
import java.util.Scanner;

public class Exercise_07_10 {
	public static void main(String[] args)
	{
		double [] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = input.nextDouble();
		}
		indexOfSmallestElement(array);
	}
	
	public static int indexOfSmallestElement(double[] array)
	{
		int index = 1;
		double temp = array[0];
		for(int i = 0; i < array.length - 1; i++)
		{
			if(array[i] > array[i + 1])
			{
				index = i + 2;
				temp = array[i + 1];
			}
		}
		System.out.println("The minimum number is "+temp+" and index is "+index);
		return 0;
		
	}
}
