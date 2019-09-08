
public class Box {
	int width;
	int height;
	int depth;
	static int volume;
	int find_volume(){
		volume=width*height*depth;
		return volume;
	}
	Box(int w,int h,int d) {
		width=w;
		height=h;
		depth=d;
	}

	public static void main(String[] args) {
		Box b=new Box(10,20,10);
		b.find_volume();
		System.out.println("volume of box is : "+volume);
	}

}
