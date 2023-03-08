package com.app.services;

import com.app.pojos.User;

public interface IUserService {
	User loginRequest(String email, String password);

}
