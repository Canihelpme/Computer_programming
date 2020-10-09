/*
(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.
			Sales Amount                   Commission Rate
			------------------------------------------------
			$0.01–$5,000                     8 percent
			$5,000.01–$10,000               10 percent
			$10,000.01 and above            12 percent
Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
you have to generate in order to make $30,000.
*/

  
/*
(Financial application: compute commissions) Write a method that computes the
commission, using the scheme in Programming Exercise 5.39. The header of the
method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:
               Sales Amount        Commission
               --------------------------------
               10000                 900.0
               15000                1500.0
               ...
               95000               11100.0
               100000              11700.0
*/
package java_lab_04;
import java.util.Scanner;

public class Exercise_06_11 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of sales: ");
		double salesAmount = input.nextDouble();
		double a = computeCommission(salesAmount);
		System.out.printf("%s" , a);
	}
	
	public static double computeCommission(double salesAmount)
	{
		double commission = 0;
		if(salesAmount  >= 10000)
		{
			commission += (salesAmount - 10000) * 0.12;
			commission += 5000 * 0.10;
			commission += 5000 * 0.08;
		}
		else if(salesAmount >= 5000 && salesAmount < 10000)
		{
			commission += (salesAmount - 5000) * 0.10;
			commission += 5000 * 0.08;
		}
		else if(salesAmount  >= 0 && salesAmount < 5000)
		{
			commission += salesAmount * 0.08;
		}
		return (commission);
	}
}
