package com.app.services;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.FacilityRepository;
import com.app.dao.PropertyRepository;
import com.app.pojos.Facilities;
import com.app.pojos.PropertyDetails;

@Service
@Transactional
public class OwnerServiceImpl  implements IOwnerService{
	@Autowired
	private PropertyRepository propertyRepo;
	
	@Autowired
	private FacilityRepository facilityRepo;

	@Override
	public PropertyDetails addProperty(PropertyDetails property) {
		property.setDate(LocalDate.now());
		property.setStatus("Available");
		return propertyRepo.save(property);
	}

	@Override
	public Facilities addFacilities(Facilities facility) {
		System.out.println("in add facility method");
		return facilityRepo.save(facility);
	}
}
