package HUFS_STUDENT_MANAGEMENT_FINAL;

import java.util.Scanner;


public class Hufs_course_management2 {
	
	Scanner input = new Scanner(System.in);
	Hufs_course_hashmap hashmap = new Hufs_course_hashmap();
	int Available_id = 1;
	
	int temp_id;
	String temp_name;
	int temp_course_level;
	int temp_dept_id;
	int temp_capacity;
	int temp_time;
	
	public void Add_courses()
	{
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
			
			System.out.printf("The key is %d. Please, remember.\n\n", Available_id);
			hashmap.map.put(Available_id ,new Hufs_course_info(temp_id, temp_name, temp_course_level, temp_dept_id, temp_capacity, temp_time));
			Available_id++;
			
			System.out.println("Enter 'TRUE' if you want to keep SEARCH courses.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	
	
	public void Display_courses()
	{
		while(true)
		{
			for(int i = 1; i < Available_id; i++)
			{
				print_func(i);
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
			for(int j = 1; j < Available_id; j++)
			{
				if(hashmap.map.get(j).getId() == search_num)
				{
					print_func(j);
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
			for(int k = 0; k < Available_id; k++)
			{
				if(hashmap.map.get(k).getId() == update_num)
				{
					System.out.println("Enter the course ID: ");
					hashmap.map.get(k).setId(input.nextInt());
					
					System.out.println("Enter the course Name: ");
					hashmap.map.get(k).setName(input.next());
					
					System.out.println("Enter the level of the course: ");
					hashmap.map.get(k).setCourse_level(input.nextInt());
					
					System.out.println("Enter the Id of Department: ");
					hashmap.map.get(k).setDept_id(input.nextInt());
					
					System.out.println("Enter the Capacity of class: ");
					hashmap.map.get(k).setCapacity(input.nextInt());
					
					System.out.println("Enter the Time of course: ");
					hashmap.map.get(k).setTime(input.nextInt());
				}
			}
			System.out.println("Enter 'TRUE' if you want to keep Update courses.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	public void print_func(int j)
	{
		System.out.println("Course ID: "+ hashmap.map.get(j).getId());
		System.out.println("Course Name: "+hashmap.map.get(j).getName());
		System.out.println("Course Level: " + hashmap.map.get(j).getCourse_level());
		System.out.println("Course DepartmentID : " + hashmap.map.get(j).getDept_id());
		System.out.println("Course Capacity: "+ hashmap.map.get(j).getCapacity());
		System.out.println("Course Time: "+ hashmap.map.get(j).getTime());
		System.out.println("\n");
	}
	
	
}
