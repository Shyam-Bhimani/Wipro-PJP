package arrays;

import java.util.Arrays;

public class Fifth {

	public static void main(String[] args) {
		int[] num=new int[] {5,65,42,67,3,69,43,76,41};
		int length=num.length;
		Arrays.sort(num);
		System.out.printf("2 Largest is: %d %d\n",num[length-1],num[length-2]);
		System.out.printf("2 Smallest is: %d %d",num[0],num[1]);
	}

}
