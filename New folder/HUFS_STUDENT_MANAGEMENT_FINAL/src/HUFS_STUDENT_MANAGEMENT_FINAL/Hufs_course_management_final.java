package HUFS_STUDENT_MANAGEMENT_FINAL;

import java.util.Scanner;

public class Hufs_course_management_final {
	public static void main(String[] args)
	{
		Hufs_course_management2 info = new Hufs_course_management2();
		Scanner insert = new Scanner(System.in);
		
		while(true)
		{
			int select = 0;
			System.out.println("----------Choose the number what you want----------");
			System.out.println("1.Add courses");
			System.out.println("2.Search courses");
			System.out.println("3.Update courses");
			System.out.println("4.Display all courses");
			System.out.println("5.Shutdown");
			System.out.println("Enter the number: ");
			select = insert.nextInt();
			
			if(select == 1)
				info.Add_courses();
			else if(select == 2)
				info.Search_courses();
			else if(select == 3)
				info.Update_courses();
			else if(select == 4)
				info.Display_courses();
			else if(select == 5)
				 break;
		}
		
	}

}
