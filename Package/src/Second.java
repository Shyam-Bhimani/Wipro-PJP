import com.wipro.automobile.ship.*;
public class Second {

	public static void main(String[] args) {
		Compartment c=new Compartment();
		c.height=20;
		c.width=10;
		c.breadth=20;
		int area=c.breadth*c.height*c.width;
		System.out.println(area);
	}

}
