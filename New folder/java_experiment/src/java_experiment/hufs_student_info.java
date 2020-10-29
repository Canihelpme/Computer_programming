package java_experiment;

public class hufs_student_info {
	private int id;
	private int age;
	private String name;
	private String address;
	private String department;
	private String grade;
	
	public hufs_student_info(int id, int age, String name, String address, String department, String grade)
	{
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.department = department;
		this.grade = grade;
	}
	
	
	public Integer getId()
	{
		return id;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public String gethufs_student_info()
	{
		String Hufs_student_info = String.format("%d, %d, %s, %s, %s", id, age, name, address, department, grade);
		return Hufs_student_info;
	}

}
