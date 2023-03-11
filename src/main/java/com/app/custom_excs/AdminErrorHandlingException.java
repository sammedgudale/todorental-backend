package com.app.custom_excs;

public class AdminErrorHandlingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AdminErrorHandlingException(String mesg) {
		super(mesg);
	}

}
