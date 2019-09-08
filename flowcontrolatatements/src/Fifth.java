public class Fifth {
public static void main(String[] args) {
	 char var1='a';
	//int var1=2;  
	if(var1>='a'&&var1<='z'||var1>='A'&&var1<='Z'){
		  System.out.println("Alphabet");
	  }
	  else if(var1>=0&&var1<=9) {
		  System.out.println("Number");
	  }
	  else {
		  System.out.println("Special Character");		  
	  }
	}
}
