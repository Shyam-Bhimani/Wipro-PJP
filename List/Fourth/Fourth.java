import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Fourth {
	List<Number> values=new ArrayList<>();
	public void printAll() {
		Iterator i=values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		Fourth t=new Fourth();
		t.values.add(1);
		t.values.add(1.5);
		t.values.add(1.5f);
 		t.printAll();
	}

}
