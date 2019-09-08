package testsuite1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestConcate.class, TestEmployee.class, TestPalindrome.class })
public class AllTests {

}
