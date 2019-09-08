import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array : ");
			int n= sc.nextInt();
			int[] a=new int [n];
			System.out.println("Enter Element");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Enter index which u want : ");
			int ind = sc.nextInt();
			try{
				System.out.println("The array element at Index "+ind+" = "+a[ind]);
				System.out.println("Array element successfully accessed");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Warning!Please enter the index less than "+n);
			}
			sc.close();
			
	}

}
