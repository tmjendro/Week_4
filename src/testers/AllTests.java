package testers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestDeposit.class, TestWithdraw.class })
public class AllTests {

}
