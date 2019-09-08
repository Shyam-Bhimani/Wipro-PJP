package arrays;

public class Seventh {

	public static void main(String[] args) {
		int[] num=new int[] {32,65,7,67,65,54,7,34,32};
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[count]==num[i]) {
				num[i]=num[i++];
				count++;
			}
			System.out.println(num[i]);
		}
			
	}

}
