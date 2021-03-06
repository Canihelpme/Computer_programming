/*
(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0.
Note that if a number occurs more than one time, the plural word �times� is used
in the output.
*/
package java_lab_04;
import java.util.Scanner;
public class Exercise_07_03 
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		int dupl_check = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100");
		int string_array[] = new int[100];
	
		for(i = 0; i < 100; i++)
		{
			int a = input.nextInt();
			if(a != 0)
				string_array[i] = a;
			else if(a == 0)
				break;
		}
		int array_size = string_array.length;
		for(i = 0; i < array_size - 1; i++)
		{
			if(string_array[i] != 0)
			{
				for(j = 0; j < array_size - 2; j++)
				{
					if(string_array[i] == string_array[j + 1])
					{
						dupl_check++;
					}
				}
				if(dupl_check > 1)
				{
					System.out.println(string_array[i]+" occurs "+dupl_check+" times");
					dupl_check = 0;
				}
				else if(dupl_check == 1)
				{
					System.out.println(string_array[i]+" occurs "+dupl_check+" times");
					dupl_check = 0;
				}
			}
		}
		
	}
}
