package arrays;

public class First {

	public static void main(String[] args) {
		int[] num = new int[]{1,3,6,7,-9,4,5,6};
	       
	       int sum = 0;
	       for(int i=0; i < num.length ; i++)
	        sum = sum + num[i];
	        System.out.println("Sum is : " + sum);
	        double average = sum / num.length;
	        System.out.println("Average is : " + average);

	}

}
