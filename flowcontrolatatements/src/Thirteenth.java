public class Thirteenth {

		public static void main(String[] args) {
			for(int i=10;i<99;i++) {
				if(isPrime(i))
				System.out.println(i);
			}
		}
		 public static boolean isPrime(int n) {  
		       if (n <= 1) {  
		           return false;  
		       }  
		       for (int j = 2; j < Math.sqrt(n); j++) {  
		           if (n % j == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		   }  

	}