package testers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;


public class TestWithdraw {
	 double balance1 = 100;
	 private BankAccount acc;
	
	@Before
	public void setUp() throws Exception {
		 acc = new BankAccount(balance1);
		
	}

	@Test
	public void testWithdrawl() throws AssertionError {
		assertTrue(acc.withdrawl(150.0) == -50.0);
		System.out.println("$" + acc.withdrawl(0));
	}

}
