package Employee;

import java.util.Iterator;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Shyam", "1 street, India", 90000.0));
		list.add(new Employee(102, "Ankita", "2 street, India", 65000.0));
		list.add(new Employee(103, "Meet", "3 street, India", 55000.0));
		list.add(new Employee(104, "Parth", "4 street, India", 30000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}
