public class MainClass {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Shyam", "sbhimani@gmail.com", 'M', 50000);
		Employee emp2 = new Employee(102, "Meet", "meet234@gmail.com", 'M', 30000);
		Employee emp3 = new Employee(103, "Ankita", "ankita@gmail.com", 'F', 40000);
		Employee emp4 = new Employee(104, "Parth", "parth12@gmail.com", 'M', 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}
