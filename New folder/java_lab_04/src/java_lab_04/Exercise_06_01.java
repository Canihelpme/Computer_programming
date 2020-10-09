/*
(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
*/

package java_lab_04;

public class Exercise_06_01 
{
	public static void main(String[] args)
	{
		int PENTAGONAL_NUM = 100;
		int PERLINE = 10;
		
		System.out.println("The first 100 pentagonal numbers, ten per line: ");
		for(int i = 1; i <= PENTAGONAL_NUM; i++)
		{
			if(i % PERLINE == 0)
				System.out.printf("%8d\n", getPentagonalNumber(i));
			else
				System.out.printf("%8d", getPentagonalNumber(i));
		}
		
	}
	public static int getPentagonalNumber(int n)
	{
		return (n * (3 * n - 1) / 2);	
	}
	
}
