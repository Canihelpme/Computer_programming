package HUFS_STUDENT_MANAGEMENT_FINAL;
public class Hufs_student_info {
	
	private int Id;
	private String Name;
	private String Address;
	private int Dept;
	
	Hufs_student_info()
	{
		Id = 0;
		Name = null;
		Address = null;
		Dept = 0;
	}
	
	Hufs_student_info(int nId, String nName)
	{
		Id = nId;
		Name = nName;
		Address = null;
		Dept = 0;
	}
	
	Hufs_student_info(int nId, String nName, String nAddress)
	{
		Id = nId;
		Name = nName;
		Address = nAddress;
		Dept = 0;
	}
	
	Hufs_student_info(int nId, String nName, String nAddress, int nDept)
	{
		Id = nId;
		Name = nName;
		Address = nAddress;
		Dept = nDept;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getDept() {
		return Dept;
	}

	public void setDept(int dept) {
		Dept = dept;
	}

}
