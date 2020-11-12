package HUFS_Student_Management;
import java.util.*;


public class Hash_practice {
	
	int index = 0;
	int temp_add_id = 0;
	String temp_add_name;
	int update_num = 0;
	int search_num = 0;
	int temp_up_id = 0;
	int select = 0;
	int k;
	int check_num = 0;
	
	//Student information
	int ID;
	String Name;
	String Address;
	String Department;
	static Hufs_student[] stu = new Hufs_student[100];
	Scanner input = new Scanner(System.in);
	
	Hufs_hashmap hashmap = new Hufs_hashmap();
	
	public void Add_stu()
	{
		while(true)
		{
			stu[index] = new Hufs_student();
			System.out.println("Enter the student id: ");
			System.out.println("0 can't be id. ");
			int temp_add_id = input.nextInt();
			for(int j = 0; j < index; j++)
			{
				if(stu[j].getID() == temp_add_id)
				{
					System.out.println("Error! Duplicated ID. ");
					System.out.println("Enter again the student id: ");
					temp_add_id = input.nextInt();
				}
			}
			//중복검사 끝.
			stu[index].setID(temp_add_id);
			
			System.out.println("Enter Student Name: ");
			temp_add_name = input.next();
			stu[index].setName(temp_add_name);
			
			System.out.println("Enter Student Address: ");
			stu[index].setAddress(input.next());
			
			System.out.println("Enter Student Department: ");
			stu[index].setDepartment(input.next());
			
			System.out.println("The information you want to add is: ");
			System.out.println(stu[index].getID());
			System.out.println(stu[index].getName());
			System.out.println(stu[index].getAddress());
			System.out.println(stu[index].getDepartment());
			
			//By using Hashmap in here you can make a map to store the data and also make a pointer by index.
			hashmap.map.put(temp_add_id, temp_add_name);
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
			Iterator<Integer> keys = hashmap.map.keySet().iterator();
			while(keys.hasNext())
			{
				Integer Up_key = keys.next();
				String value = hashmap.map.get(Up_key);
				System.out.println("ID: "+Up_key+", Name: "+value);
			}
			
			System.out.println("Enter the student ID whom you want to update: ");
			update_num = input.nextInt(); 
			
			for(int i = 0; i < index; i++)
			{
				if(stu[i].getID() == update_num) //Find by 'Hashmap'
				{
					k = i;
				}
			}
				System.out.println("Enter the number what you want to update: ");
				System.out.println("1.ID   2.Name   3.Address   4.Department   5.Whole");
				System.out.println("5.Whole is not completed. Do not Enter 5.");
				select = input.nextInt();

				if(select == 1)
				{
					System.out.println("Enter the student ID to update: ");
					temp_up_id = input.nextInt();
					for(Integer Up_key2 : hashmap.map.keySet())
					{
						while(Up_key2 == temp_up_id)
						{
							System.out.println("Error! Duplicated ID.");
							System.out.println("Enter again the student ID to update");
							temp_up_id = input.nextInt();
						}
					}
					stu[k].setID(temp_up_id);
					hashmap.map.remove(update_num);
					hashmap.map.put(temp_up_id, stu[k].getName());
					System.out.println("Update completed.");
					k = 0;
				}
				
				else if(select == 2)
				{
					System.out.println("Enter the student name to update: ");
					String temp_up_name = input.next();
					stu[k].setName(temp_up_name);
					hashmap.map.put(update_num, temp_up_name);
					System.out.println("Update completed.");
				}
				
				else if(select == 3)
				{
					System.out.println("Enter the student address to update: ");
					stu[k].setAddress(input.next());
					System.out.println("Update completed.");
				}
				
				else if(select == 4)
				{
					System.out.println("Enter the student department to update: ");
					stu[k].setDepartment(input.next());
					System.out.println("Update completed.");
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
			System.out.println("Enter the student ID you want to search: ");
			search_num = input.nextInt();
			for(Integer ser_key : hashmap.map.keySet())
			{
				while(ser_key == search_num)
				{
					for(int compare_num = 0; compare_num < index; compare_num++)
					{
						if(stu[compare_num].getID() == ser_key)
						{
							System.out.println("Here's the info.");
							System.out.println("ID: "+stu[compare_num].getID());
							System.out.println("Name: "+stu[compare_num].getName());
							System.out.println("Address: "+stu[compare_num].getAddress());
							System.out.println("Department: "+stu[compare_num].getDepartment());
						}
					}
					break;
				}
			}
			System.out.println("Enter 'TRUE' if you want to keep SEARCH stud	ents.   " + "Otherwise enter the 'FALSE'.");
			boolean loopFlag = input.nextBoolean();
			if(!loopFlag) break;
		}
	}
	
	public void Display_stu()
	{
		for(Integer dis_key : hashmap.map.keySet())
		{
			while(true)
			{
				for(int dis_num = 0; dis_num < index; dis_num++)
				{
					if(dis_key == stu[dis_num].getID())
					{
						System.out.println(stu[dis_num].getID()+"\n");
						System.out.println(stu[dis_num].getName()+"\n");
						System.out.println(stu[dis_num].getAddress()+"\n");
						System.out.println(stu[dis_num].getDepartment()+"\n");
						System.out.println("---------------------");
					}
					check_num++;
					dis_key++;
				}
				if(check_num == index)
				{
					break;
				}
			}
		}
	}
	
	
}