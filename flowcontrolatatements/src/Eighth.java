public class Eighth {

		public static void main(String[] args) {
			char ch=args[0].charAt(0);
			  switch (ch) {
			case 'R':
				System.out.println(ch+"->Red");
				break;
			case 'B':
				System.out.println(ch+"->Blue");
				break;
			case 'G':
				System.out.println(ch+"->Green");
				break;
			case 'O':
				System.out.println(ch+"->Orange");
				break;
			case 'Y':
				System.out.println(ch+"->Yellow");
				break;
			case 'W':
				System.out.println(ch+"->White");
				break;
			default:
				System.out.println("Invalid Code");
				break;
			}
			  
		}

	}