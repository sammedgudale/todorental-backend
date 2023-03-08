package com.app.custom_exception;

public class CustomerHandlingException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public CustomerHandlingException(String msg) {
		super(msg);
		
	}

}
