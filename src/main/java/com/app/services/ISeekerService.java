package com.app.services;

import java.util.List;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dto.OwnerDetailsDTO;
import com.app.dto.PropertyDetailsDTO;

public interface ISeekerService {
           OwnerDetailsDTO getContactDetails(Long propid) throws ResourceNotFoundException;
       List<PropertyDetailsDTO> searchPropertyByCity(String city) throws ResourceNotFoundException;
	

}
