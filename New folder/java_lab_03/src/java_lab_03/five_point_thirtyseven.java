package java_lab_03;
import java.util.*;

public class five_point_thirtyseven 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal integer: ");
		int decimal = input.nextInt();
		
		String binary = "";
		for(int i = decimal; i >0; i /=2)
		{
			binary = (i % 2) + binary;
		}
		
		System.out.println("The binary value of the decimal \"" + decimal + "\" is: " +binary);
	}

}
