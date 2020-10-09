package Basic;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class PackageExample {
	/*
	public static void random(String[] args)
	{
		System.out.println("Math class examples "+ Math.random()*100000000);	
	}
	*/
	
	public static void main(String[] args)
	{
		double celsius;
		double fahrenheit;
	
		Scanner input = new Scanner(System.in);
		
		fahrenheit = input.nextDouble();
		celsius = (5*(fahrenheit-32)) / 9;
		
		System.out.println("Celcsius is "+ celsius);
	}

}
