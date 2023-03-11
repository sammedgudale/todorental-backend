package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dao.PropertyRepository;
//import com.app.dao.AreaInfoRepository;
//import com.app.dao.CityRepository;
import com.app.dao.UserRepository;
import com.app.dto.OwnerDetailsDTO;
import com.app.dto.PropertyDetailsDTO;
//import com.app.dto.AreaDTO;
@Service
@Transactional
public class SeekerServiceImpl implements ISeekerService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PropertyRepository propRepo;
	@Override
	public OwnerDetailsDTO getContactDetails(Long propid) throws ResourceNotFoundException {
		boolean exists=propRepo.existsById(propid);
		   if(!exists)
			throw new ResourceNotFoundException("property is unavailable !!!");
		     OwnerDetailsDTO contact=propRepo.getOwnerDetails(propid);
		       return contact;
              
}
	@Override
	public List<PropertyDetailsDTO> searchPropertyByCity( String city) throws  ResourceNotFoundException{
		         String name=propRepo.existsCityByName(city);
		         boolean exists=Boolean.parseBoolean(name);
		         if(exists)
		         throw new ResourceNotFoundException("Invalid cityName and areaName!!!!!");
		         return propRepo.findFlatByCity( city);
		       
	}
}
