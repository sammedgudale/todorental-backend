package com.app.services;

import java.util.List;

import javax.transaction.Transactional;



import com.app.custom_excs.ResourceNotFoundException;
import com.app.pojos.User;


@Transactional
public interface IAdminService {
	
    List<User> fetchAllUsers();
    String deletePropertyById(Long propId) throws ResourceNotFoundException;

    
}
