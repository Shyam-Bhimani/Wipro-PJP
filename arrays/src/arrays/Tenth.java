package arrays;

public class Tenth {
	static int findMax(int mat[][]){ 
        int maxElement = Integer.MIN_VALUE; 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                if (mat[i][j] > maxElement) { 
                    maxElement = mat[i][j]; 
                } 
            } 
        } 
        return maxElement; 
    } 
	
	public static void main(String[] args) {
			if(args.length==9) {
			 int[][] num = new int[3][3];
			 int count=0; 
			 for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						num[i][j]=Integer.parseInt(args[count]);
						count++;
					}
			 }
			 System.out.println("The given Array is :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		 
		 System.out.println("The biggest number in the given Array is :"+findMax(num));
		 
		}else {
			System.out.println("Please enter 9 integer numbers");
		}
		
	}

}
