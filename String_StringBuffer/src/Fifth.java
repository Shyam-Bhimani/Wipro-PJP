import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.nextLine();
		int findex=(str.length())-1;
		System.out.println(str.substring(1, findex));
	}

}
