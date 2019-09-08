public class Student extends Persons{
	int studid;
	public Student(String name, String DOB,int studid) {
		super(name, DOB);
		this.studid=studid; 
	}
	void test() {
		System.out.println("Name : "+name);
		System.out.println("Date of Birth : "+DOB);
		System.out.println("Student ID : "+studid);
	}

}
