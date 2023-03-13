package com.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.dao.FacilityRepository;
//import com.app.dao.AreaInfoRepository;
//import com.app.dao.CityRepository;
import com.app.dao.PropertyRepository;
import com.app.dto.AddPropertyDTO;
import com.app.pojos.Facilities;
//import com.app.dto.SelectCityTaluqaDTO;
//import com.app.pojos.City;
import com.app.pojos.PropertyDetails;
import java.time.LocalDate;
@Service
@Transactional
public class OwnerServiceImpl implements IOwnerService {
	//@Autowired
	//private CityRepository cityRepo;
	@Autowired
	private PropertyRepository propRepo;
	
	
	@Autowired
	private FacilityRepository facilityRepo;
	@Override
	public int addProperty(PropertyDetails propData) {
		   // PropertyDetails propData1=((propData.getAreaName(),propData.getCityData(),propData.getAreaPropData()));
		   propData.setStatus("Available");
		   System.out.println(LocalDate.now());
		    propData.setDate(LocalDate.now());
		  // propData.setDate();
		     propRepo.save(propData);
		    return propData.getId();
	}
	/*@Override
	public List<SelectCityTaluqaDTO> selectCityAndTaluqa() {
		 return areaRepo.selectCityTaluqa();
	}*/
	@Override
	public String addFacilities(Facilities facility) {
		//System.out.println(facility.getFacilityData().getId());
		facilityRepo.save(facility);
		return "Facilities Updated";
	}
	

}
