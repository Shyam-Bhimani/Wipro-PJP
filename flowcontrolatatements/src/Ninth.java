public class Ninth {

		public static void main(String[] args) {
			if(args.length==0) {
				System.out.println("Please Enter a Month in Number");
			}else {
				int mon=Integer.parseInt(args[0]);
				switch (mon) {
				case 1:
					System.out.println("January");
					break;
				case 2:
					System.out.println("Fabruary");
					break;
				case 3:
					System.out.println("March");
					break;
				case 4:
					System.out.println("April");
					break;
				case 5:
					System.out.println("May");
					break;
				case 6:
					System.out.println("June");
					break;
				case 7:
					System.out.println("July");
					break;
				case 8:
					System.out.println("August");
					break;
				case 9:
					System.out.println("Saptember");
					break;
				case 10:
					System.out.println("October");
					break;
				case 11:
					System.out.println("November");
					break;
				case 12:
					System.out.println("December");
					break;
				default:
					System.out.println("Invalid Month");
					break;
				}	
				
			}
			  
		}

	}