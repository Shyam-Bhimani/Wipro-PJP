public class NumberSystem {
	public static void main(String[]args) {
		Integer i=Integer.parseInt(args[0]);
		System.out.println("Given Number : "+i);
		System.out.println("Binary : "+Integer.toBinaryString(i));
		System.out.println("Octal : "+Integer.toOctalString(i));
		System.out.println("Hexadecimal :"+Integer.toHexString(i));
	}
}
