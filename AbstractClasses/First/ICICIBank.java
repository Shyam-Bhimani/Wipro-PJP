public class ICICIBank extends GeneralBank{

	@Override
	void getSavingIntrestRate() {
		System.out.println("ICICI Bank Saving Rate : 4%");
	}

	@Override
	void getFixedDepositIntrestRate() {
		System.out.println("ICICI Bank Fixed Rate : 8.5%");
	}

}
