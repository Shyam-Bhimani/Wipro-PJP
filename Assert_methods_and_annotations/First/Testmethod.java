import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Testmethod {
Employee e=new Employee();
ArrayList<String> names = new ArrayList<String>( Arrays.asList("shyam", "meet", "parth") );
String name="shyam";
	@Test
	void test() {
		 assertEquals("FOUND", e.findName(names, name));
	}

}
