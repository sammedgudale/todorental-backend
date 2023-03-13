package com.app.services;
import com.app.pojos.Facilities;
//import com.app.dto.SelectCityTaluqaDTO;
//import com.app.pojos.City;
import com.app.pojos.PropertyDetails;
public interface IOwnerService {
         //List<SelectCityTaluqaDTO> selectCityAndTaluqa();
		int addProperty(PropertyDetails propData);
		
		String addFacilities(Facilities facility);
		 
}
