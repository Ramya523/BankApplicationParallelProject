package com.cg.bank.uiesception;

public class InvalidIDException extends Exception {
	public InvalidIDException() {
		System.err.println("Invalid Credentials");
	}

}
