package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseDTO;
import com.app.pojos.PropertyDetails;
import com.app.services.IOwnerService;

@RestController
@RequestMapping("/owner")
@CrossOrigin
public class OwnerController {
	
	@Autowired
	private IOwnerService ownerService;
	
	public OwnerController() {
		System.out.println("In ctor of " + getClass().getName());
	}
	
	@PostMapping("/property")
	public ResponseEntity<?> addProperty(@RequestBody PropertyDetails property){
		return new ResponseEntity<>(ownerService.addProperty(property),HttpStatus.CREATED);
		
	}
	

}
