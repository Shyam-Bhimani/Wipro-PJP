package testsuite1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalindrome {
Testsuite obj=new Testsuite();
	@Test
	public void test() {
		 assertEquals(true, obj.palindromeCheck("DAD"));
	}

}
