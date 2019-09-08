import java.util.LinkedList;

public class Fifth {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("January");
		l.add("February");
		l.add("March");
		l.add("April");
		l.add("May");
		l.add("June");
		l.add("July");
		l.add("August");
		l.add("September");
		l.add("October");
		l.add("November");
		l.add("December");
		l.forEach(System.out::println);

	}

}
