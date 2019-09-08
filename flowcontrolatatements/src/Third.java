public class Third {
public static void main(String[] args) {
	int arglength=args.length;
	if(arglength==0) {
	System.out.println("No Values");
	}
	else {
		for(int i=0;i<arglength;i++) {
			System.out.print(args[i]+",");
		}
		//System.out.println(args[arglength]);
	}
}
}

