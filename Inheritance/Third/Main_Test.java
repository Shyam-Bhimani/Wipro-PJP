
public class Main_Test {

	public static void main(String[] args) {
		Persons p=new Persons("Shyam","4th jan 1997");
		String name=p.setname();
		String DOB=p.setdob();
		
		Teacher  t=new Teacher(name,DOB,50000,"Computer Network");
		 Student s=new Student(name, DOB,007);
		 College c=new College(name,DOB,007,"Parul",4);
		 t.test();
		 System.out.println();
		 s.test();
		 System.out.println();
		 c.test();

	}

}
