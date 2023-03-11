package com.app.dto;

import java.util.List;
public interface FacilityDetailsDTO {
	  int getId();
	String getAddress();
	String getRent();
	String getStatus();
	String getCity();
    List<Facilities> getFacilityList();
      interface Facilities{
    	   String getFurnished();
    	   String getLift();
    	   String getCctv();
      }
     
}
