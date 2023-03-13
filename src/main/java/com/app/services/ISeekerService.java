package com.app.services;

import java.util.List;

import com.app.custom_excs.ResourceNotFoundException;
import com.app.dto.OwnerDetailsDTO;
import com.app.dto.PropertyDetailsDTO;
//import com.app.dto.AreaDTO;

public interface ISeekerService {
           OwnerDetailsDTO getContactDetails(int propid) throws ResourceNotFoundException;
       List<PropertyDetailsDTO> searchPropertyByCity(String city) throws ResourceNotFoundException;

}
