package com.cg.bank.custservice;

import com.cg.bank.customer.Customer;
import com.cg.bank.transaction.Transaction;



public interface CustService {
	Long register(Customer customer);
	Customer login(long acc, String pswd);
	Transaction fundTransfer(Transaction transaction);
	long deposit(Customer customer,long amt);

	long withdrawl(Customer customer,long amt);

	long dispBal(Customer customer,long amt);


}
