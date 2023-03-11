	package com.app.pojos;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="property_details")
@Data
public class PropertyDetails extends BaseEntity {

	
	private String address;
	private double rent;
	private String status;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="prop_add_date")
	private LocalDate date;
	@Enumerated(EnumType.STRING)
	@Column(name="property_type",length = 20 )
	private Type propertyType;
	@Column(name="City",length=30)
	private String city;
	@OneToMany(mappedBy = "photoData",cascade = CascadeType.ALL,orphanRemoval = true)
	  @JsonIgnoreProperties("photoData")
	private List<PropertyPhotos>propertyphoto=new ArrayList<>();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="owner_id")
	@JsonIgnoreProperties("prolist")
	//@JsonIgnore
	private User ownerData;
	@OneToMany(mappedBy="facilityData",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnoreProperties("facilityData")
	//@JsonIgnore
	   List<Facilities>facilityList=new ArrayList<>();
	
	
	public PropertyDetails() {
		super();
	}
	public PropertyDetails(String address, double rent, String status,LocalDate date, Type propertyType, String city) {
		super();
		this.address = address;
		this.rent = rent;
		this.status = status;
		this.date = date;
		this.propertyType = propertyType;
		this.city = city;
		
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Type getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(Type propertyType) {
		this.propertyType = propertyType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PropertyDetails [address=" + address + ", rent=" + rent + ", status=" + status + ", date=" + date
				+ ", propertyType=" + propertyType + ", city=" + city
				+  "]";
	}
	
}

