package HUFS_STUDENT_MANAGEMENT_FINAL;

public class Hufs_course_info {
	private int Id;
	private String Name;
	private int Course_level;
	private int Dept_id;
	private int Capacity;
	private int Time;
	
	Hufs_course_info()
	{
		Id = 0;
		Name = null;
		Course_level = 0;
		Dept_id = 0;
		Capacity = 0;
		Time = 0;
		
	}
	Hufs_course_info(int nId, String nName, int nCourse_level, int nDept_id, int nCapacity, int nTime)
	{
		Id = nId;
		Name = nName;
		Course_level = nCourse_level;
		Dept_id = nDept_id;
		Capacity = nCapacity;
		Time = nTime;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCourse_level() {
		return Course_level;
	}

	public void setCourse_level(int course_level) {
		Course_level = course_level;
	}

	public int getDept_id() {
		return Dept_id;
	}

	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

}
