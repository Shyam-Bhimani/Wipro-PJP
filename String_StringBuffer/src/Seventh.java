import java.util.Scanner;
public class Seventh {
	static StringBuffer output;
	public static void main(String[] args) {
		String str; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		char first=str.charAt(0);
		char last=str.charAt((str.length())-1);
		if(first=='x' || last=='x'){
			if(first=='x')
			sb.deleteCharAt(0);
			if(last=='x')
			sb.deleteCharAt((sb.length())-1);
			System.out.println(sb);
		}else {
			System.out.println(str);
		}
	}

}
