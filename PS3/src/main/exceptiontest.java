package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class exceptiontest {

	Account c;
	
	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void Withdraw() throws InsufficientFundsException {
		
		c.setAnnualInterestRate(4.5);
		
		c.withdraw(2500);
		
		c.deposit(3000);
		
		System.out.println("balance: " + c.getBalance() + ", monthly interest: " + c.getMonthlyInterestRate() + ", date: " + c.getDateCreated());
		
        try {
        	c.withdraw(900000);
        	
        } catch(InsufficientFundsException i) {
        	
        	System.out.println("Insufficient funds, we need " + i.getInsufficientFunds());
        	
        }
	}

}
