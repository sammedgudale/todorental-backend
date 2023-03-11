package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dto.ResponseDTO;
import com.app.services.IAdminService;



@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
	@Autowired
	private IAdminService adminService;
	public AdminController()
	{
		System.out.println("in ctor:-"+getClass().getName());
	}
	@GetMapping("/users")
	public ResponseDTO<?> fetchAllUsers()
	{
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", adminService.fetchAllUsers());
	}
	@DeleteMapping("/delete/{propId}")
	 public ResponseDTO<?> deleteById(@PathVariable Long propId)
	 {
		  try {
			 return new ResponseDTO<>(HttpStatus.OK,"Property removed succssfully",adminService.deletePropertyById(propId));
		} catch (ResourceNotFoundException e) {
			return new ResponseDTO<>(HttpStatus.BAD_REQUEST,"This property is not present",null);
		}
	 }
	 
}
