public class Ninteenth {
		public static void main(String[] args) {
			int cnter = 0;
			int i = 0;
			
			while (cnter != 5) {
				i++;
				
				if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
					System.out.println(i);
					cnter++;
				}
			}
		}  

	}