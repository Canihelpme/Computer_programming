package java_lab_03;
import java.util.Scanner;

public class five_point_fourtysix {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String string = input.nextLine();
		
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--)
		{
			reverse += string.charAt(i);
		}
		
		System.out.println("The reversed string is "+ reverse);
		
	}

}
