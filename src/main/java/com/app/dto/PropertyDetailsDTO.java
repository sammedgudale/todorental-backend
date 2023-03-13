package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.Type;

public interface PropertyDetailsDTO {
	  Long getId();
	String getAddress();
	String getRent();
	String getStatus();
	String getCity();
	Type getPropertyType();
	LocalDate getDate();
     
}
