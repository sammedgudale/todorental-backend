package com.app.pojos;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "Property_facilities")
public class Facilities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(length=25)
private String furnished;
	@Column(length=25,name="security_gurad")
private String securityGuard;
	@Column(length=25)
private String lift;
	@Column(length=25)
private String cctv;
         @ManyToOne(fetch = FetchType.LAZY)
         @JoinColumn(name="propertyid")
         @JsonIgnoreProperties("facilityList")
     	//@JsonIgnore
         private PropertyDetails facilityData;
	public Facilities()
	{
		
	}
	public Facilities(String furnished, String securityGuard, String lift, String cctv) {
		super();
		this.furnished = furnished;
		this.securityGuard = securityGuard;
		this.lift = lift;
		this.cctv = cctv;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFurnished() {
		return furnished;
	}
	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}
	public String getSecurityGuard() {
		return securityGuard;
	}
	public void setSecurityGuard(String securityGuard) {
		this.securityGuard = securityGuard;
	}
	public String getLift() {
		return lift;
	}
	public void setLift(String lift) {
		this.lift = lift;
	}
	public String getCctv() {
		return cctv;
	}
	public void setCctv(String cctv) {
		this.cctv = cctv;
	}
	public PropertyDetails getFacilityData() {
		return facilityData;
	}
	public void setFacilityData(PropertyDetails facilityData) {
		this.facilityData = facilityData;
	}
	@Override
	public String toString() {
		return "Facilities [id=" + id + ", furnished=" + furnished + ", securityGuard=" + securityGuard + ", lift="
				+ lift + ", cctv=" + cctv + "]";
	}
      
	
}
