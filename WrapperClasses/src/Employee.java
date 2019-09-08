
public class Employee implements Cloneable {
	int empNo;
	String empName;
	int Salary;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException {
		 Employee emp=new Employee();
		 emp.empNo=001;
		 emp.empName="Shyam";
		 emp.Salary=90000;
		 Employee emp1=(Employee) emp.clone();
		 emp.empNo=002;
		 emp.empName="Dhoni";
		 emp.Salary=60000;
		 System.out.println("Clone object values");
		 System.out.println("Employee Name : "+emp1.empName);
		 System.out.println("Employee No : "+emp1.empNo);
		 System.out.println("Employee Salary : "+emp1.Salary);
		 System.out.println();
		 System.out.println("Original object values");
		 System.out.println("Employee Name : "+emp.empName);
		 System.out.println("Employee No : "+emp.empNo);
		 System.out.println("Employee Salary : "+emp.Salary);
		 
	}

}
