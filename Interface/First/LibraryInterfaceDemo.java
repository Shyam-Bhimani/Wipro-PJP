public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUser k=new KidUser(10,"Kids");
		AdultUser a=new AdultUser(24, "Fiction");
		k.registerAccount();
		System.out.println();
		k.requestBook();
		System.out.println();
		System.out.println();
		a.registerAccount();
		System.out.println();
		a.requestBook();
		
	}
}
