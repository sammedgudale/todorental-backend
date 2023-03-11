package com.app.dto;
import java.util.List;
//import com.app.pojos.City;
import com.app.pojos.PropertyDetails;
import lombok.Data;
@Data
public class AddPropertyDTO {
	private String areaName;
	private String pinCode;
	private  String city;
	private List<PropertyDetails> areaPropData;
	
	public AddPropertyDTO(String areaName, String city, List<PropertyDetails> areaPropData) {
		super();
		this.areaName = areaName;
		this.city = city;
		this.areaPropData = areaPropData;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<PropertyDetails> getAreaPropData() {
		return areaPropData;
	}
	public void setAreaPropData(List<PropertyDetails> areaPropData) {
		this.areaPropData = areaPropData;
	}
	

}
