package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.dto.FacilityDetailsDTO;
import com.app.dto.OwnerDetailsDTO;
import com.app.dto.PropertyDetailsDTO;
import com.app.pojos.PropertyDetails;
public interface PropertyRepository extends JpaRepository<PropertyDetails, Long>{
	@Query("select p from PropertyDetails p")
	     List<PropertyDetailsDTO> getAllPropertList();
	
	@Query("select p from PropertyDetails p join fetch p.facilityList where p.id=:propid")
	    FacilityDetailsDTO getFacilityDetails(@Param("propid") Long id );

	@Query("select a.city from PropertyDetails a where a.city=:city")
	String existsCityByName(@Param(value="city")String city);
   
	@Query("select a from PropertyDetails a where a.city=:city")
    List <PropertyDetailsDTO> findFlatByCity(@Param(value = "city") String city);
	
	@Query ("select p from PropertyDetails p join fetch p.ownerData where p.id=:propid")
	  OwnerDetailsDTO getOwnerDetails(@Param ("propid") Long propid);
}
