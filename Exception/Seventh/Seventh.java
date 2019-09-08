
public class Seventh {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seventh reg = new Seventh();
		
		try {
			reg.registerUser("Mickey", "US");
	 
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
