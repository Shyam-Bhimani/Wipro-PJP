import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testpalindrome {
	Demo2 d2=new Demo2();
	@Test
	void test() {
		 assertEquals(true, d2.palindromeCheck("DAD"));
	}

}
