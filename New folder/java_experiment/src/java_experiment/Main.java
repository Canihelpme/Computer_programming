package java_experiment;
import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Student_info info = new Student_info();
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			int select = 0;
			System.out.println("----------Choose the number what you want----------");
			System.out.println("1.Add student");
			System.out.println("2.Search student");
			System.out.println("3.Update student");
			System.out.println("4.Display all student");
			System.out.println("5.Shutdown");
			System.out.println("Enter the number: ");
			select = input.nextInt();
			
			if(select == 1)
				info.Add_stu();
			else if(select == 2)
				info.Search_stu();
			else if(select == 3)
				info.Update_stu();
			else if(select == 4)
				info.Display_stu();
			else if(select == 5)
				if(!info.shutdown()) break;
		}
		
	}
}
