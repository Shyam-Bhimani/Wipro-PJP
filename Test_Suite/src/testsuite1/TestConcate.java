package testsuite1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcate {
	Testsuite obj=new Testsuite();
	@Test
	public void test() {
		assertEquals("Shyam",obj.stringConcat("Shy","am"));
	}

}
