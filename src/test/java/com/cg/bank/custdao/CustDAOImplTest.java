package com.cg.bank.custdao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.bank.customer.Customer;
import com.cg.bank.transaction.Transaction;

class CustDAOImplTest {
	long bal=0,dbal=0;
	CustDAOImpl cust=new CustDAOImpl();
	Customer customer=new Customer();
	Transaction transaction=new Transaction();
	Customer customer1=new Customer();

	@Test
	void testRegister() {
		customer.setAadhaarNo("123151087910");
		customer.setAddress("Hyd");
		customer.setBalance(1000);
		customer.setEmailId("bindu@gmail");
		customer.setFirstName("Suj135");
		customer.setLastName("N V N");
		customer.setMobileNo("4023511848");
		customer.setPancardNo("231346");
		customer.setPassword("mad934");
		long acc= cust.register(customer);
		assertEquals(2000,acc);
		
	}

	@Test
	void testLogin() {
		customer1=cust.login(2000, "mad934");
		assertEquals(customer1,customer1);
	}

	@Test
	void testDeposit() {
		 dbal=cust.deposit(customer1, 1000);
		assertEquals(1000,dbal);
	}

	@Test
	void testWithdrawl() {
		customer1.setBalance(1000);
		bal=cust.withdrawl(customer1,100);
		assertEquals(900, bal);
	}

	@Test
	void testShowBal() {
		customer1.setBalance(100);
		bal=cust.showBal(customer1, 100);
		assertEquals(100, bal);
	}

	@Test
	void testFundTransfer() {
		transaction.setAmountTransferred(10);
		transaction.setFromAccountNo(1004);
		transaction.setToAccountNo(1001);
		assertEquals(null, cust.fundTransfer(transaction));
	}

}
