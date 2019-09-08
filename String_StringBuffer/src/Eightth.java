import java.util.Scanner;
public class Eightth {

	public static void main(String[] args) {
		String str; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.nextLine();
		int loc=str.indexOf('*');
		StringBuffer sb=new StringBuffer(str);
		sb.deleteCharAt(loc-1);
		sb.deleteCharAt(loc);	 
		System.out.println(sb);
	}

}
