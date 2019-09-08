import java.util.ArrayList;
import java.util.List;


public class First {

	public static void main(String[] args) {
		List<String> values=new ArrayList<String>();
		values.add("January");
		values.add("February");
		values.add("March");
		values.add("April");
		values.add("May");
		values.add("June");
		values.add("July");
		values.add("August");
		values.add("September");
		values.add("October");
		values.add("November");
		values.add("December");
		
		for(String i:values) {
			System.out.println(i);
		}
	}

}
