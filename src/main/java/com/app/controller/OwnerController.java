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
import com.app.pojos.Facilities;
import com.app.pojos.PropertyDetails;
import com.app.services.IOwnerService;

@RestController
@RequestMapping("/owner")
@CrossOrigin
public class OwnerController {
	
	@Autowired
	private  IOwnerService ownerService;
	  public OwnerController() {
		// TODO Auto-generated constructor stub
		   System.out.println("in ctor :-"+getClass().getName());
	}
       @PostMapping("/property")
       public ResponseDTO<?>addProperty(@RequestBody PropertyDetails request)
       {
    	   return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", ownerService.addProperty(request));
       }
       
       
       @PostMapping("/addfacilities")
       public ResponseDTO<?>addFacility(@RequestBody Facilities request)
       {
    	   return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", ownerService.addFacilities(request));
       }
	

}
