package com.app.dto;


public class LoginRequest {
	private String email;
	private String password;
	
<<<<<<< HEAD
=======
	
>>>>>>> db5217c9a2db68fc78ff1676fcb69c4727f6309c
	public LoginRequest() {
		super();
	}

	public LoginRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequest [email=" + email + ", password=" + password + "]";
	}

	
	

}
