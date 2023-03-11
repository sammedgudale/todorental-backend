package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dao.AdminRepository;
import com.app.dao.PropertyRepository;
import com.app.pojos.User;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {
        @Autowired
        private AdminRepository adminRepo;
        @Autowired
        private PropertyRepository propRepo;
	@Override
	public List<User> fetchAllUsers() {
		
		return adminRepo.findAll();
	}

	@Override
	public String deletePropertyById(Long propId) throws ResourceNotFoundException {
		boolean exists=propRepo.existsById(propId);
		if(!exists)
			 throw new ResourceNotFoundException("wrong property data");
		      propRepo.deleteById(propId); 
		return "property is deleted with id"+propId;
	}

}
