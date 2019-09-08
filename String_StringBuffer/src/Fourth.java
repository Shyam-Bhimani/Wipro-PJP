import java.util.Scanner;

public class Fourth {
	static String sub;
	public static void main(String[] args) {
		String str;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	      if(length%2==0) {
	    	   sub=str.substring(0,(length/2));
	      }else {
	    	  sub=null;
	      }
	      System.out.println(sub);
	}

}
