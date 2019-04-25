package com.cg.bank.custdao;

import com.cg.bank.customer.Customer;
import com.cg.bank.transaction.Transaction;

public interface CustDAO {
	Long register(Customer customer);
	Customer login(long acc,String pswd);
	Transaction fundTransfer(Transaction transaction);
	long deposit(Customer customer,long amt);
	long withdrawl(Customer customer,long amt);
	long showBal(Customer customer,long amt);


}
