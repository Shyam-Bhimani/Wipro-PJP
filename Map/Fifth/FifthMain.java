import java.util.HashMap;
import java.util.TreeMap;


public class FifthMain {

	public static void main(String[] args) {
		CountryMap5 countryMap5 = new CountryMap5();

		countryMap5.saveCountryCapital("India", "Delhi");
		countryMap5.saveCountryCapital("Japan", "Tokyo");
		countryMap5.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap5.getCapital("India"));
		System.out.println(countryMap5.getCountry("Tokyo"));
		System.out.println(countryMap5.toArrayList());
		
		TreeMap<String, String> M2 = countryMap5.swapKyeValue();
		System.out.println(M2);
	}

}
