package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Facilities;
import com.app.pojos.PropertyDetails;

public interface IOwnerService {
 
	@Autowired
	PropertyDetails addProperty(PropertyDetails propData);
	
	@Autowired
	String addFacilities(Facilities facility);
	 

}
