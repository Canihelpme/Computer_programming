package HUFS_STUDENT_MANAGEMENT_FINAL;
import java.util.Scanner;
import java.util.Iterator;

public class Hufs_student_management {
	
	int Id;
	String Name;
	String Address;
	int Dept_id;
	static Hufs_student_info[] std = new Hufs_student_info[100]; //Have to change to ArrayList.
	Scanner input = new Scanner(System.in);
	Hufs_student_hashmap hashmap = new Hufs_student_hashmap();
	
	public void Add_std()
	{
		int add_index = 0;
		int temp_add_id = 0;
		std[add_index] = new Hufs_student_info();
		System.out.println("0 can't be an ID.\n");
		System.out.println("Enter the student id: \n");
		temp_add_id = input.nextInt();
		std[add_index].setId(temp_add_id);
		System.out.println("Enter the student Name: \n");
		std[add_index].setName(input.next());
		System.out.println("Enter the student Address: \n");
		std[add_index].setAddress(input.next());
		System.out.println("Enter the student Department ID: \n");
		std[add_index].setDept(input.nextInt());
		hashmap.map.put(temp_add_id, std[add_index]);
		add_index++;
		System.out.println("Enter 'True if you want to keep add student. OR Enter 'False'.");
		/**boolean loopFlag = input.nextBoolean();
		if(!loopFlag) break;**/ //Use after make a loop.
		
		System.out.print(std[add_index].getId());
		System.out.print(std[add_index].getName());
		System.out.print(std[add_index].getAddress());
		System.out.print(std[add_index].getDept());
		Iterator<Integer> keys = hashmap.map.keySet().iterator();
		while(keys.hasNext()) 
		{
			int key = keys.next();
			System.out.println("key"+ key + "value" + hashmap.map.get(key));
		}
		
	}
}
