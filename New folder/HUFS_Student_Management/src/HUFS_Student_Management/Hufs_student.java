package HUFS_Student_Management;
import java.util.*;

public class Hufs_student {
	
	private int ID = 0;
	private String name;
	private String address;
	private String department;
	
	Hufs_student()
	{
		ID = 0;
		name = null;
		address = null;
		department = null;
	}
	
	Hufs_student(int nID, String nName, String nAddress)
	{
		ID = nID;
		name = nName;
		address = nAddress;
	}
	
	Hufs_student(int nID, String nName, String nAddress, String nDepartment)
	{
		ID = nID;
		name = nName;
		address = nAddress;
		department = nDepartment;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
