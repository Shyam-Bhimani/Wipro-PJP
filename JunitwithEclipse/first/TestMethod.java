

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMethod {
	Demo1 d=new Demo1();
	@Test
	public void test() {
		assertEquals("Shyam",d.stringConcat("Shy","am"));
	}

}
