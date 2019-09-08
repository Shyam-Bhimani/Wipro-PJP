import java.util.Iterator;
import java.util.TreeSet;

public class Countryclass {
	TreeSet<String> H1 = new TreeSet<>();
	//HashSet<String> H1 = new HashSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}
