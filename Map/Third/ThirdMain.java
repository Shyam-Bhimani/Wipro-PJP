import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ThirdMain {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("West Bengal", "Kolkata");
		properties.setProperty("Rajasthan", "Jodhpur");
		properties.setProperty("Bihar", "Patna");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
