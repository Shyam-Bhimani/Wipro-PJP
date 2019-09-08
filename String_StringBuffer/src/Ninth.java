import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		String a,b; 
		int len;
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a : ");
		a=sc1.nextLine();
		System.out.println("Enter b : ");
		b=sc2.nextLine();
		StringBuffer finalString = new StringBuffer(); 

		int i = 0, j = 0; 
		while (i < a.length() && j < b.length()) { 

		    finalString.append(a.charAt(i++)); 
		    finalString.append(b.charAt(j++)); 
		} 	
		if (i != a.length()) { 
		    finalString.append(a.substring(i)); 
		} 
		if (j != b.length()) { 
		    finalString.append(b.substring(j)); 
		} 
		System.out.print(finalString);
	}

}

 