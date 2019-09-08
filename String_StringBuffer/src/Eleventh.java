
public class Eleventh {

	public static void main(String[] args) {
		 String str1="asdXYa1234XYkjj";
		 String str2="XY";
		 StringBuffer sb=new StringBuffer();
		 int len=str2.length();
		 int ind=str1.indexOf(str2); 
		 if(ind!=0)
		 sb.append(str1.charAt(ind-1));
		 sb.append(str1.charAt(ind+len));
		 int lastind=str1.lastIndexOf(str2); 
		 sb.append(str1.charAt(lastind-1));
		  if(((str1.length())-1)!=(lastind+len-1))
				 sb.append(str1.charAt(lastind+len));
		 System.out.print(sb);
	}
}
