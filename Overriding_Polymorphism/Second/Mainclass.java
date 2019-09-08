public class Mainclass {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape s=new Square();
		Shape t=new Triangle();
		c.Draw();
		c.Erase();
		System.out.println();
		s.Draw();
		s.Erase();
		System.out.println();
		t.Draw();
		t.Erase();
	}

}
