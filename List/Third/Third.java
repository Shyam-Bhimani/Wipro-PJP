import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Third {
	List<String> values=new ArrayList<>();
	public void printAll() {
		Iterator i=values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		Third t=new Third();
		t.values.add("Sunday");
		t.values.add("Monday");
		t.values.add("Tuesday");
		t.values.add("Wednesday");
		t.values.add("Thursday");
		t.values.add("Friday");
		t.values.add("Saturday");
		t.printAll();
	}

}
