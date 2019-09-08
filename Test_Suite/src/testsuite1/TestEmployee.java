package testsuite1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

 
public class TestEmployee {
	Testsuite obj=new Testsuite();
	ArrayList<String> names = new ArrayList<String>( Arrays.asList("shyam", "meet", "parth") );
	String name="shyam";
	@Test
	public void test() {
		assertEquals("FOUND", obj.findName(names, name));
	}

}
