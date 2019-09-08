public class Employee extends Person {
	double annual_salary;
	int start_year;
	String Nat_Ins_No;
	Employee(double ansal,int syear,String natin) {
		super(name);
		annual_salary=ansal;
		start_year=syear;
		Nat_Ins_No=natin;
	}
	void getval() {
		System.out.println("Employee Name : " +name);
		System.out.println("Annual Salary : " +annual_salary);
		System.out.println("start_year : " +start_year);
		System.out.println("National Insurance Number : " +Nat_Ins_No);
	}
	
}
