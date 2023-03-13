package com.app.services;

import java.util.List;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dto.FacilityDetailsDTO;
import com.app.dto.PropertyDetailsDTO;
import com.app.dto.UpdateDTO;
import com.app.pojos.Role;
import com.app.pojos.User;


public interface IUserService {
	User loginRequest(String email,String password);
	User registerationForm(User user);
	User updateProfile(int userid,UpdateDTO user) throws ResourceNotFoundException;
	List<PropertyDetailsDTO> getAllProperty();
	FacilityDetailsDTO getPropertyFacilities(int propid);
	User profilePage(int userid,Role role);
	  String forgetPassword(String email,String password) throws ResourceNotFoundException;

	


}
