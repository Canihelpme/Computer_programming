package HUFS_STUDENT_MANAGEMENT_FINAL;

public class Hufs_student_management_final_main {
	public static void main(String[] args)
	{
		Hufs_course_management course = new Hufs_course_management();
		course.Add_courses();
		course.Display_courses();
		//course.Search_courses();
		course.Update_courses();
	}
}
