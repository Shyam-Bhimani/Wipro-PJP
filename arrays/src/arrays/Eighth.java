package arrays;

public class Eighth {

	public static void main(String[] args) {
		int[] n =new int[] {11,6,3,5,8,9,7,2};
		int sum = 0;
		outer:
		for (int i = 0; i < n.length; i++) {
		    if (n[i] == 6) {
		        for (int j = i + 1; j < n.length; j++) {
		            if (n[j] == 7) {
		                i = j;
		                continue outer;
		            }
		        }
		    }
		    sum += n[i];
		}

		System.out.println(sum);
	}

}
