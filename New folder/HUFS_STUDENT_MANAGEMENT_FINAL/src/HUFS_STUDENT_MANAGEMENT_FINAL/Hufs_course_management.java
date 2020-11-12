package HUFS_STUDENT_MANAGEMENT_FINAL;
import java.util.*;
import java.util.Map.Entry;

public class Hufs_course_management {
	
	Scanner input = new Scanner(System.in);
	Hufs_course_hashmap hashmap = new Hufs_course_hashmap();

	public void Add_courses()
	{

		int temp_id;
		String temp_name;
		int temp_course_level;
		int temp_dept_id;
		int temp_capacity;
		int temp_time;
		while(true)
		{
			System.out.println("Enter the course ID: ");
			temp_id = input.nextInt();
			
			System.out.println("Enter the course Name: ");
			temp_name = input.next();
			
			System.out.println("Enter the level of the course: ");
			temp_course_level = input.nextInt();
			
			System.out.println("Enter the Id of Department: ");
			temp_dept_id = input.nextInt();
			
			System.out.println("Enter the Capacity of class: ");
			temp_capacity = input.nextInt();
			
			System.out.println("Enter the Time of course: ");
			temp_time = input.nextInt();
			
			hashmap.map.put(temp_id,new Hufs_course_info(temp_id, temp_name, temp_course_level, temp_dept_id, temp_capacity, temp_time));
			System.out.println("Enter 'TRUE' if you want to keep SEARCH courses.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	
	
	public void Display_courses()
	{
		while(true)
		{
			System.out.println("-----List of students-----");
			Iterator<Integer> keys = hashmap.map.keySet().iterator();
			for (Entry<Integer, Hufs_course_info> map : hashmap.map.entrySet()) 
			{
				System.out.println("[Key]:" + map.getKey() + " [Value]:" + map.getValue());
			}
		System.out.println("Enter 'TRUE' if you want to keep SEARCH courses.   " + "Otherwise enter the 'FALSE'.");
		boolean loopFlag = input.nextBoolean();
		if(!loopFlag) break;
		}
	}
	
	
	
	public void Search_courses()
	{
		while(true)
		{
			System.out.println("Enter the course Id you want to search: ");
			int search_num = input.nextInt();
			for(Integer ser_key : hashmap.map.keySet())
			{
				if(ser_key == search_num)
				{
					System.out.println("The information of course is: "+hashmap.map.get(ser_key));
				}
			}
			System.out.println("Enter 'TRUE' if you want to keep SEARCH courses.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	
	
	public void Update_courses()
	{
		while(true)
		{
			System.out.println("Enter the Course Id you want to update: ");
			int update_num = input.nextInt();
			for(Integer Up_key : hashmap.map.keySet())
			{
				if(Up_key == update_num)
				{
					System.out.println("The information of course you want to change is: "+ hashmap.map.get(Up_key));
					System.out.println("Enter the Course ID to update: ");
					int temp_up_id = input.nextInt();
					hashmap.map.get(temp_up_id);
				}
			}
			System.out.println("Enter 'TRUE' if you want to keep Update courses.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}

	
	
}
