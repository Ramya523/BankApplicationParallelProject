package com.cg.bank.custservice;

import com.cg.bank.custdao.CustDAO;
import com.cg.bank.custdao.CustDAOImpl;
import com.cg.bank.customer.Customer;
import com.cg.bank.transaction.Transaction;

public class CustServiceImpl implements CustService {

	CustDAO custdao = new CustDAOImpl();
	Customer customer = new Customer();
	boolean validateUserInput(Customer customer) {
		boolean b=false;
		if (customer.getMobileNo().length() == 10) {
			if (customer.getAadhaarNo().length() == 12) {
				b=true;
			} else
				b=false;
		} else
			b=false;
		
		return b;
		
	}

	public Long register(Customer customer) {
		boolean b= validateUserInput(customer);
		if(b) {
			long accNo = custdao.register(customer);
			return accNo;
		}
		else
			return (long) 0;

	}

	public Customer login(long acc, String pswd) {
		customer = custdao.login(acc, pswd);
		return customer;

	}
	public long deposit(Customer customer,long amt) {
		long res=custdao.deposit(customer,amt);
		return res;
	}

	public long withdrawl(Customer customer,long amt) {
		long res=custdao.withdrawl(customer,amt);
		return res;
	}

	public long dispBal(Customer customer,long amt) {
		long res=custdao.showBal(customer,amt);
		return res;
		
	}

	public Transaction fundTransfer(Transaction transaction) {
		transaction=custdao.fundTransfer(transaction);
		return transaction;
	}

}
