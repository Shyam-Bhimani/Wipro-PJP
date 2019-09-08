package arrays;

import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		int[] num = new int[]{1,3,6,7,-9,4,9,6};
		int length=num.length;
		Arrays.sort(num);
		 
		System.out.println("minimum is"+num[0]);
		System.out.println("maximum is"+num[length-1]);
	 
		

	}

}
