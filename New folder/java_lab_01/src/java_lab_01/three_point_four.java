package java_lab_01;
import java.util.Random;

public class three_point_four {
	public static void main(String [] args)
	{
		double randomValue = Math.random();
		int month_num = (int)(randomValue * 12) +1;
		if(month_num == 1)
			System.out.println("January");
		else if(month_num == 2)
			System.out.println("Feburary");
		else if(month_num == 3)
			System.out.println("March");
		else if(month_num == 4)
			System.out.println("April");
		else if(month_num == 5)
			System.out.println("May");
		else if(month_num == 6)
			System.out.println("June");
		else if(month_num == 7)
			System.out.println("July");
		else if(month_num == 8)
			System.out.println("August");
		else if(month_num == 9)
			System.out.println("September");
		else if(month_num == 10)
			System.out.println("October");
		else if(month_num == 11)
			System.out.println("November");
		else if(month_num == 12)
			System.out.println("December");
	}

}
