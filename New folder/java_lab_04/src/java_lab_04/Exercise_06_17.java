/*
(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix.
*/
package java_lab_04;
import java.util.Scanner;
import java.util.Random;

public class Exercise_06_17 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number the size of 2dimension-array");
		int n =  input.nextInt();
		printMatrix(n);
	}
	
	
	public static void printMatrix(int n)
	{
		Random random = new Random();
		int [][] array = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				array[i][j] = random.nextInt(2);
				System.out.print(array[i][j]+"");
			}
			System.out.println("\n");
		}
	}

}
