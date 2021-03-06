/*
(Display patterns) Write a method to display a pattern as follows:
                  1
                2 1
              3 2 1
    ...
    n n-1 ... 3 2 1
The method header is
public static void displayPattern(int n)
*/
package java_lab_04;

import java.util.Scanner;

public class Exercise_06_06 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		displayPattern(number);
	}
	public static void displayPattern(int n)
	{
		int blank = n;
		for(int i = 1; i <= n; i++)
		{
			for(int k = 0; k < blank; k++)
			{
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--)
			{
				System.out.printf("%d", j);
			}
			System.out.printf("\n");
			--blank;
		}
	}
}
