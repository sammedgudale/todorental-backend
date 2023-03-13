package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="property_details")
public class PropertyDetails<SeekerFavList> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String rent;
	private String status;
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

	//@OneToMany(mappedBy = "propList",cascade = CascadeType.ALL,orphanRemoval = true)
	//@JsonIgnoreProperties("propList")
	//  private SeekerFavList favData;
	
	public PropertyDetails()
     {
    	 
     }


	
	

	public PropertyDetails(String address, String rent, String status, LocalDate date, Type propertyType, String city) {
		super();
		this.address = address;
		this.rent = rent;
		this.status = status;
		this.date = date;
		this.propertyType = propertyType;
		this.city = city;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
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

	public List<PropertyPhotos> getPropertyphoto() {
		return propertyphoto;
	}

	public void setPropertyphoto(List<PropertyPhotos> propertyphoto) {
		this.propertyphoto = propertyphoto;
	}

	public User getOwnerData() {
		return ownerData;
	}

	public void setOwnerData(User ownerData) {
		this.ownerData = ownerData;
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

	public List<Facilities> getFacilityList() {
		return facilityList;
	}

	public void setFacilityList(List<Facilities> facilityList) {
		this.facilityList = facilityList;
	}
	

	@Override
	public String toString() {
		return "PropertyDetails [id=" + id + ", address=" + address + ", rent=" + rent + ", status=" + status
				+ ", date=" + date + "]";
	} 
	
}
