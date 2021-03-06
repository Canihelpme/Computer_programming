/*
(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.
*/
package java_lab_04;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_06_18 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();
		if(Valid_check(password))
		{
			System.out.println("Verified password");
		}
		else
		{
			System.out.println("Unverified password");
		}
	}
	public static boolean Valid_check(String password)
	{
		String Pass_word_policy = "((?=.*[a-zA-Z])(?=.[0-9].{2,}).{8,})";
		Pattern pattern_pwd = Pattern.compile(Pass_word_policy);
		Matcher matcher_pwd = pattern_pwd.matcher(password);
		return matcher_pwd.matches();
	}

}
