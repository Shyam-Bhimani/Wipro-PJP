public class KotMBank extends GeneralBank{

	@Override
	void getSavingIntrestRate() {
		System.out.println("KotMBank Saving Rate : 6%"); 
	}

	@Override
	void getFixedDepositIntrestRate() {
		System.out.println("KotMBank Fixed Rate : 9%");
	}

}
