package com.app.services;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PropertyRepository;
import com.app.pojos.PropertyDetails;

@Service
@Transactional
public class OwnerServiceImpl  implements IOwnerService{
	@Autowired
	private PropertyRepository propertyRepo;

	@Override
	public PropertyDetails addProperty(PropertyDetails property) {
		property.setDate(LocalDate.now());
		property.setStatus("Always available");
		
		return propertyRepo.save(property);
	}

}
