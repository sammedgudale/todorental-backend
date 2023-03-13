package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dto.ForgetPasswordDTO;
import com.app.dto.LoginRequest;
import com.app.dto.ResponseDTO;
import com.app.dto.UpdateDTO;
import com.app.pojos.Role;
import com.app.pojos.User;
import com.app.services.IUserService;

@RestController
@RequestMapping("/users")
@CrossOrigin

public class UserController {

	@Autowired
	private IUserService userService;

	public UserController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	@PostMapping("/login")
	public ResponseDTO<?> Login(@RequestBody LoginRequest request) {
		System.out.println("values of request" + request.getEmail());
		return new ResponseDTO<>(HttpStatus.OK, "login done succssfully",
				userService.loginRequest(request.getEmail(), request.getPassword()));
	}

	@PostMapping("/register")
	public ResponseDTO<?> register(@RequestBody User user) {

		return new ResponseDTO<>(HttpStatus.OK, "registeration done successfully", userService.registerationForm(user));

	}

	public ResponseDTO<?> updateProfile(@PathVariable Integer userid, @RequestBody UpdateDTO user) {
		try {
			return new ResponseDTO<>(HttpStatus.OK, "Update operation done successfully",
					userService.updateProfile(userid, user));
		} catch (ResourceNotFoundException e) {
			return new ResponseDTO<>(HttpStatus.BAD_GATEWAY, "Use valid userid", null);
		}
	}

	@GetMapping("/property")
	public ResponseDTO<?> getAllPropertyHomePage() {
		return new ResponseDTO<>(HttpStatus.OK, "Fetching property list successfully", userService.getAllProperty());
	}

	@GetMapping("/facility/{propid}")
	public ResponseDTO<?> getAllPropertyHomePage(@PathVariable Integer propid) {
		return new ResponseDTO<>(HttpStatus.OK, "Fetching property list successfully",
				userService.getPropertyFacilities(propid));
	}

	@PostMapping("/profile/{userid}")
	public ResponseDTO<?> profilePage(@PathVariable Integer userid, @RequestBody Role role) {
		return new ResponseDTO<>(HttpStatus.OK, "Fetching property list successfully",
				userService.profilePage(userid, role));
	}

	@PostMapping("/forgetpassword")
	public ResponseDTO<?> forgetPassword(@RequestBody ForgetPasswordDTO password) {
		try {
			return new ResponseDTO<>(HttpStatus.OK, "Fetching property list successfully",
					userService.forgetPassword(password.getEmail(), password.getPassword()));
		} catch (ResourceNotFoundException e) {
			return new ResponseDTO<>(HttpStatus.BAD_GATEWAY, "Use valid user email", null);
		}
	}
}
