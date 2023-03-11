package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginRequest;
import com.app.dto.ResponseDTO;
import com.app.pojos.User;
import com.app.services.IUserService;

@RestController
@RequestMapping("/users")
@CrossOrigin

public class UserController {
	
	@Autowired
	private IUserService userService;

	public UserController()
	{
		System.out.println("in ctor of "+getClass().getName());
	}

	@PostMapping("/login")
	public ResponseDTO<?> Login(@RequestBody LoginRequest request) {
		System.out.println("values of request" + request.getEmail());
		return new ResponseDTO<>(HttpStatus.OK, "login done succssfully",
				userService.loginRequest(request.getEmail(), request.getPassword()));
	}
	
    @PostMapping("/register")
    public ResponseDTO<?> register(@RequestBody User user)
    {
   	
			return new ResponseDTO<>(HttpStatus.OK,"registeration done successfully",userService.registerationForm(user));
		
    }
}
