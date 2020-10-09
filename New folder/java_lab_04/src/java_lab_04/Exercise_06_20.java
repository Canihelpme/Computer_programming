/*
(Count the letters in a string) Write a method that counts the number of letters in
a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number
of letters in the string.
*/
package java_lab_04;
import java.util.Scanner;

public class Exercise_06_20 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String letters = input.nextLine();
		System.out.printf("%d", countLetters(letters));
	}
	
	public static int countLetters(String s)
	{
		int string_len = s.length();
		return(string_len);
	}
	
}
