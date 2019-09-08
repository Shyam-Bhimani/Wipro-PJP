public class MainClass {
	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		GeneralBank g=new KotMBank();
		//GeneralBank g=new ICICIBank();
		i.getSavingIntrestRate();
		System.out.println();
		i.getFixedDepositIntrestRate();
		System.out.println();
		k.getFixedDepositIntrestRate();
		System.out.println();
		k.getSavingIntrestRate();
		System.out.println();
		g.getFixedDepositIntrestRate();
		g.getSavingIntrestRate();
	}
}
