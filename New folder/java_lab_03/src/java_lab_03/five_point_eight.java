package java_lab_03;
import java.util.*;

public class five_point_eight {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int highestScore = 0;
		String highestScoreName = "";
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.println("Enter each student's name and score: ");
		for (int i = 1; i <= numberOfStudents; i++) 
		{
			System.out.println("Student" + i + "\n Name: ");
			String name = input.next();
			System.out.println("Score: ");
			int score = input.nextInt();
			
			if(score > highestScore)
			{
				highestScore = score;
				highestScoreName = name;
			}
			
		}
		System.out.println("Student with the highest score is: " + highestScoreName);
		
	}

}
