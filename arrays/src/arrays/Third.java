package arrays;

public class Third {

	public static void main(String[] args) {
		int[] num=new int[] {1,2,3,4,6,23,76,45,34};
		int findvar=34,flag=0,place=-1;
		for(int i=0;i<num.length;i++) {
			if(num[i]==findvar) {
				flag=1;
				place=i;
				}else {
				flag=0;
			}
		}
			if(flag==1) {
				System.out.println(place);
			}else {
				System.out.println(place);
			}
		}

}
