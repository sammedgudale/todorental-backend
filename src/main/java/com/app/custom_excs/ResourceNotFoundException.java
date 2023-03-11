package com.app.custom_excs;

public class ResourceNotFoundException extends Exception {
      
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String errMesg) {
		super(errMesg);
}
}