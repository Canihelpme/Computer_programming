package java_experiment;
import java.util.*;

public class hufs_student_management {
	
	int index = 0;
	int temp_add_id = 0;
	int update_num = 0;
	int search_num = 0;
	int temp_up_id = 0;
	int select = 0;
	int ID;
	String Name;
	String Address;
	String Department;
	static Student_info[] stu = new Student_info[100];
	Scanner input = new Scanner(System.in);
	
	public void Add_stu()
	{
		while(true)
		{
			stu[index] = new Student_info();
			System.out.println("Enter the student id: ");
			int temp_add_id = input.nextInt();
			for(int j = 0; j <index; j++)
			{
				if(stu[j].ID == temp_add_id)
				{
					System.out.println("Error! Duplicated ID.");
					System.out.println("Enter again the student id:");
					temp_add_id = input.nextInt();
				}
			}
			stu[index].ID = temp_add_id;
				
			System.out.println("Enter Student Name: ");
			stu[index].Name = input.next();
				
			System.out.println("Enter Student Address: ");
			stu[index].Address = input.next();
				
			System.out.println("Enter Student Department:");
			stu[index].Department = input.next();
			
			System.out.println("The information you want to add is: ");
			System.out.println(stu[index].ID);
			System.out.println(stu[index].Name);
			System.out.println(stu[index].Address);
			System.out.println(stu[index].Department);

			index++;
			System.out.println("Enter 'TRUE' if you want to keep add students.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	public void Update_stu()
	{
		while(true)
		{
			System.out.println("-----LIST OF STUDENTS-----");
			for(int i = 0; i < index; i++)
				System.out.println(stu[i].ID+" "+stu[i].Name);
			System.out.println("Enter the student ID whom you want to update: ");
			update_num = input.nextInt();
			for(int i = 0; i < index; i++)
			{
				if(stu[i].ID == update_num)
				{
					System.out.println("Enter the number what you want to update: ");
					System.out.println("1.ID   2.Name   3.Address   4.Department   5.Whole");
					select = input.nextInt();
					
					if(select == 1)
					{
						System.out.println("Enter the student ID to update: ");
						temp_up_id = input.nextInt();
						for(int j = 0; j <index; j++)
						{
							if(stu[j].ID == temp_up_id)
							{
								System.out.println("Error! Duplicated ID.");
								System.out.println("Enter again the student ID to update");
								temp_up_id = input.nextInt();
							}
						}
						stu[i].ID = temp_up_id;
						System.out.println("Update completed.");
					}
					
					else if(select == 2)
					{
						System.out.println("Enter the student name to update: ");
						stu[i].Name = input.next();
						System.out.println("Update completed.");
					}
					
					else if(select == 3)
					{
						System.out.println("Enter the student address to update: ");
						stu[i].Address = input.next();
						System.out.println("Update completed.");
					}
					
					else if(select == 4)
					{
						System.out.println("Enter the student department to update: ");
						stu[i].Department = input.next();
						System.out.println("Update completed.");
					}
					
					else if(select == 5)
					{
						System.out.println("Enter the student number to update");
						stu[i].ID = input.nextInt();
						System.out.println("Enter the student name to update");
						stu[i].Name = input.next();
						System.out.println("Enter the student address to update");
						stu[i].Address = input.next();
						System.out.println("Enter the student department to update");
						stu[i].Department = input.next();
						System.out.println("Update completed.");
					}
				}
			}
			System.out.println("Do you really want to finish updating?");
			System.out.println("Enter 'TRUE' if you want to keep UPDATE students.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	public void Search_stu()
	{
		while(true)
		{
			System.out.println("-----LIST OF STUDENTS-----");
			for(int i = 0; i < index; i++)
				System.out.println(stu[i].ID+" "+stu[i].Name);
			System.out.println("Enter the student ID you want to search: ");
			search_num = input.nextInt();
			for(int i = 0; i < index; i++)
			{
				if(stu[i].ID == search_num)
				{
					System.out.println(stu[i].ID);
					System.out.println(stu[i].Name);
					System.out.println(stu[i].Address);
					System.out.println(stu[i].Department);
				}
			}
			System.out.println("Enter 'TRUE' if you want to keep SEARCH students.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	public void Display_stu()
	{
		for(int i = 0; i < index; i++)
		{
			System.out.println(stu[i].ID+"\n");
			System.out.println(stu[i].Name+"\n");
			System.out.println(stu[i].Address+"\n");
			System.out.println(stu[i].Department+"\n");
			System.out.println("---------------------");
		}
	}
}