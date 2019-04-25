package com.cg.bank.uiesception;

public class TransactionException extends Exception {
	public TransactionException() {
		System.err.println("Fund Transfer failed");
	}

}
