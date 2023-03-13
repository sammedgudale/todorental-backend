package com.app.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.CustomerHandlingException;
import com.app.custom_excs.ResourceNotFoundException;
import com.app.dao.PropertyRepository;
import com.app.dao.UserRepository;
import com.app.dto.FacilityDetailsDTO;
import com.app.dto.PropertyDetailsDTO;
import com.app.dto.UpdateDTO;
import com.app.pojos.Role;
import com.app.pojos.User;


@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PropertyRepository propRepo;

	@Override
	public User loginRequest(String email, String password) {
		
		return userRepo.Login(email, password)
				.orElseThrow(() -> new CustomerHandlingException("Invalid Credentials!!!!"));
	}

	@Override
	public User registerationForm(User user){
		System.out.println("user info"+user);
		  return  userRepo.save(user);	
	}
	
	@Override
	public  User updateProfile(int userid, UpdateDTO user) throws ResourceNotFoundException {
		    boolean exists=userRepo.existsById(userid);
		     if(!exists)
		    	 throw new ResourceNotFoundException("Invalid user id!!!!!");
		         User userDetails=userRepo.findById(userid).get();
		         BeanUtils.copyProperties(user, userDetails);
		         return userDetails;
	}
	
	@Override
	public List<PropertyDetailsDTO> getAllProperty() {
		return propRepo.getAllPropertList();
	}

	@Override
	public FacilityDetailsDTO getPropertyFacilities(int propid) {
		 return propRepo.getFacilityDetails(propid);
	}

	@Override
	public User profilePage(int userid,Role role) {
	      return userRepo.profilePage(userid, role);
	}

	@Override
	public String forgetPassword(String email,String password) throws ResourceNotFoundException {
		           String em= userRepo.existsByEmail(email);
		             boolean exists=Boolean.parseBoolean(em);
		             if(!exists)
		             {
		              User userDetails=userRepo.findByEmail(email); 
		                       userDetails.setPassword(password);
		                 return "Password successfully changed";
		             }
		             throw new ResourceNotFoundException("Invalid user email!!!!!");
	}
	

}
