import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		 String a,b;
		 Scanner sc1=new Scanner(System.in);
		 Scanner sc2=new Scanner(System.in);
		 System.out.println("Enter first String : ");
		 a=sc1.nextLine();
		 System.out.println("Enter Second String : ");
		 b=sc2.nextLine();
		if(a!=null && b!=null) {
		 if(a.length()<b.length()) {
			 System.out.println(a+b+a);
		 }else {
			 System.out.println(b+a+b);
		 }
		}else {
			System.out.println("String may Empty");
		}
	}

}
