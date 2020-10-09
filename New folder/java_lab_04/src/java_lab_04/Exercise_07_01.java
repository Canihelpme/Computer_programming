/*
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10;
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
*/
package java_lab_04;
import java.util.Scanner;

public class Exercise_07_01 {
	public static void main(String[] args)
	{
		int i;
		int j;
		int k;
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int array_size = input.nextInt();
		int [] grade = new int[array_size];
		System.out.println("Enter "+array_size+" scores: ");
		for(i = 0; i< array_size; i++)
		{
			grade[i] = input.nextInt();
		}
		int max = grade[0];
		for(j = 0; j < array_size; j++)
		{
			if(max < grade[j])
			{
				max = grade[j];
			}
		}
		check(grade,max);
		
		
	}
	public static void check(int[] grade, int max)
	{
		int i;
		int array_size = grade.length;
		
		for(i = 0; i < array_size; i++)
		{
			if(grade[i] >= max - 10)
				System.out.println("Student "+i+" score is "+grade[i]+" and grade is "+" A");
			else if(grade[i] >= max - 20 && grade[i] < max - 10)
				System.out.println("Student "+i+" score is "+grade[i]+" and grade is "+" B");
			else if(grade[i] >= max - 30 && grade[i] < max - 20)
				System.out.println("Student "+i+" score is "+grade[i]+" and grade is "+" C");
			else if(grade[i] >= max - 40 && grade[i] < max - 30)
				System.out.println("Student "+i+" score is "+grade[i]+" and grade is "+" D");
			else
				System.out.println("Student "+i+" score is "+grade[i]+" and grade is "+" F");	
		}
	}
}
