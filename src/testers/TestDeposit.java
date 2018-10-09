package testers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;

public class TestDeposit {
	double balance1 = 100;
	 private BankAccount acc;
	@Before
	public void setUp() throws Exception {
		acc = new BankAccount(balance1);
	}

	@Test
	public void test() throws AssertionError {
		assertTrue(acc.deposit(50.0) == 150.0);
		System.out.println("$" + acc.deposit(0));
	}

}
