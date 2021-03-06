/*
	(Conversions between Celsius and Fahrenheit) Write a class that contains the following
	two methods:
	
	--- Convert from Celsius to Fahrenheit ---
	public static double celsiusToFahrenheit(double celsius)
	--- Convert from Fahrenheit to Celsius ---
	public static double fahrenheitToCelsius(double fahrenheit)
	
	
	The formula for the conversion is:
	fahrenheit = (9.0 / 5) * celsius + 32
	celsius = (5.0 / 9) * (fahrenheit � 32)
*/
package java_lab_04;

import java.util.Scanner;

public class Exercise_06_08 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1:Celsius to Fahrenheit 2:Fahrenheit to Celsius");
		System.out.println("Enter the number what you want: ");
		int num = input.nextInt();
		if(num == 1)
		{
			System.out.println("Enter the celsius: ");
			double celsius = input.nextDouble();
			celsiusToFahrenheit(celsius);
		}
		else if(num == 2)
		{
			System.out.println("Enter the Fahrenheit: ");
			double fahrenheit = input.nextDouble();
			fahrenheitToCelsius(fahrenheit);
		}
	}
	public static double celsiusToFahrenheit(double celsius)
	{
		double fahrenheit;
		fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println("Celsius           Fahrenheit");
		System.out.println(celsius+"             "+String.format("%.1f",fahrenheit));
		return(fahrenheit);
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		double celsius;
		celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit           Celsius");
		System.out.println(fahrenheit+"             "+String.format("%.2f",celsius));
		return(celsius);
	}
}
