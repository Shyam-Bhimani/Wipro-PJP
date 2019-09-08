import java.util.Scanner;

public class Third{
	public static void main(String[]args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No. :");
	Integer i=sc.nextInt();
	int num=Integer.parseInt(Integer.toBinaryString(i));
	System.out.println(String.format("%08d", num));
	}
}