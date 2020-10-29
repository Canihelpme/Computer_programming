package java_experiment;

public class hufs_student_main {
	public static void main(String[] args)
	{
		hufs_student_info_builder student_builder = new hufs_student_info_builder();
		
		hufs_student_info result = student_builder
				.setID(201601729)
				.setAge(25)
				.setName("Shindonghyun")
				.setAddress("Seoul")
				.setDepartment("Hufs")
				.setGrade("A")
				.build();
		
		System.out.println(result.gethufs_student_info());
	}

}
