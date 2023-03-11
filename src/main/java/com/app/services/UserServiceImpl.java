package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.CustomerHandlingException;
import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User loginRequest(String email, String password) {
		
		return userRepo.Login(email, password)
				.orElseThrow(() -> new CustomerHandlingException("Invalid Credentials!!!!"));
	}

	@Override
	public User registerationForm(User user){
		System.out.println("user info"+user);
		  return  userRepo.save(user);	
	}
	

}
