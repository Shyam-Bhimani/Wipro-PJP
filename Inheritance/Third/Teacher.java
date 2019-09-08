public class Teacher extends Persons{
	int salary;
	String subject;
	public Teacher(String name, String DOB,int salary,String subject) {
		super(name, DOB);
		this.salary=salary;
		this.subject= subject;
	}
	void test() {
		System.out.println("Name : "+name);
		System.out.println("Date of Birth : "+DOB);
		System.out.println("Salary : "+salary);
		System.out.println("Subject taken by Teacher : "+subject);
	}
}
