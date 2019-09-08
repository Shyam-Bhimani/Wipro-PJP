import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("Bangladesh", "Dhaka");
		
		// a) Check if a particular key exists or not 
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals("Japan")) {
				System.out.println("Key Japan exists");
				break;
			}
		}
		
		// b) Check if a particular value exists or not 
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals("Delhi")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}
		
		// c) Use Iterator to loop through the map key set
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
			//System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
		}
	}

}
