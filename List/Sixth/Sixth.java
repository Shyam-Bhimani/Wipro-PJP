import java.util.Vector;

public class Sixth {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("January");
		v.add("February");
		v.add("March");
		v.add("April");
		v.add("May");
		v.add("June");
		v.add("July");
		v.add("August");
		v.add("September");
		v.add("October");
		v.add("November");
		v.add("December");
		v.forEach(System.out::println);

	}

}
