package com.app.custom_excs;

public class BankAccountHandlingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BankAccountHandlingException(String mesg) {
		super(mesg);
	}

}
