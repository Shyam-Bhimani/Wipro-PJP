public class Second {
 static StringBuffer fname;
	public static void main(String[] args) {
		String Firstname="Shyamb";
		String Lastname="Bhimani";
		Firstname=Firstname.toLowerCase();
		Lastname=Lastname.toLowerCase();
		StringBuffer sb1=new StringBuffer(Firstname);
		StringBuffer sb2=new StringBuffer(Lastname);
		char last=sb1.charAt((sb1.length())-1);
		if(last==',') {
			sb1.deleteCharAt((sb1.length())-1);
		}
 		char first=sb2.charAt(0);
 		
		if(last==first) {
			sb1.deleteCharAt((sb1.length())-1);
			fname=sb1.append(sb2);
		}else {
			fname=sb1.append(sb2);
		}
		System.out.println(fname);
	}

}
