package java_experiment;

public class hufs_student_info_builder {
	private Integer id;
	private Integer age;
	private String name;
	private String address;
	private String department;
	private String grade;
	
	public hufs_student_info_builder setID(Integer id)
	{
		this.id = id;
		return this;
	}
	
	public hufs_student_info_builder setAge(Integer age)
	{
		this.age = age;
		return this;
	}
	
	public hufs_student_info_builder setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public hufs_student_info_builder setAddress(String address)
	{
		this.address = address;
		return this;
	}
	
	public hufs_student_info_builder setDepartment(String department)
	{
		this.department = department;
		return this;
	}
	
	public hufs_student_info_builder setGrade(String grade)
	{
		this.grade = grade;
		return this;
	}
	
	public hufs_student_info build()
	{
		hufs_student_info hufs_student_info = new hufs_student_info(id, age, name, address, department, grade);
		return hufs_student_info;
	}
}
