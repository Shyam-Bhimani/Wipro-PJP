public class College extends Student{
	int year;
	String clgname;
public College(String name, String DOB, int studid,String clgname,int year) {
		super(name, DOB, studid);
		this.clgname=clgname;
		this.year=year;
	}
 	void test() {
 		System.out.println("Name : "+name);
 		System.out.println("Date of Birth : "+DOB);
 		System.out.println("Student Id : "+studid);
 		System.out.println("College Name : "+clgname);
 		System.out.println("Year : "+year);
 	}
}
