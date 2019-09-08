package arrays;

public class Ninth {

	public static void main(String[] args) {
		if(args.length==4) {
		 int[][] num = new int[2][2];
		 num[0][0]=Integer.parseInt(args[0]);
		 num[0][1]=Integer.parseInt(args[1]);
		 num[1][0]=Integer.parseInt(args[2]);
		 num[1][1]=Integer.parseInt(args[3]);
		 System.out.println("The given Array is :");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(num[i][j]+" ");
		}
		System.out.println();
	}
	 System.out.println("The reverse of the Array is :");
	for(int i=1;i>=0;i--) {
		for(int j=1;j>=0;j--) {
			System.out.print(num[i][j]+" ");
		}
		System.out.println();
	}
	}else {
		System.out.println("Please enter 4 integer numbers");
	}
}
}