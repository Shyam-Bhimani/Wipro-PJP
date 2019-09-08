package arrays;

import java.util.Arrays;

public class Sixth {

	public static void main(String[] args) {
		int[] num=new int[] {32,5,65,78,87,45,3,45,65,3};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
