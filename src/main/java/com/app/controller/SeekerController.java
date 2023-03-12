package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dto.ResponseDTO;
import com.app.dto.SearchPropRequest;
import com.app.services.ISeekerService;

@RestController
@RequestMapping("/seeker")
@CrossOrigin
public class SeekerController {
	@Autowired
	private ISeekerService seekerService;

	public SeekerController() {
		System.out.println("in ctor of:-" + getClass().getName());
	}

	@PostMapping("/contactowner")
	public ResponseDTO<?> getOwnerDetails(@RequestBody Long propid) {
		try {
			return new ResponseDTO<>(HttpStatus.OK, "user deatils are successfully got ",
					seekerService.getContactDetails(propid));
		} catch (ResourceNotFoundException e) {
			return new ResponseDTO<>(HttpStatus.BAD_REQUEST, "property is not in database ", null);
		}

	}

	@PostMapping("/searchproperty")
	public ResponseDTO<?> searchPropertyByCity(@RequestBody SearchPropRequest request) {
		try {
			return new ResponseDTO<>(HttpStatus.OK, "property details are successfully got",
					seekerService.searchPropertyByCity(request.getCity()));
		} catch (ResourceNotFoundException e) {
			return new ResponseDTO<>(HttpStatus.BAD_REQUEST,
					"city or area is not in database and not property available for Rent", null);
		}
	}
}