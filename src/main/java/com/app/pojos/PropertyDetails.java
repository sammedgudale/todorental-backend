//package com.app.pojos;
//
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.*;
//import javax.persistence.JoinColumn;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@Entity
//@Table(name="property_details")
//public class PropertyDetails<SeekerFavList> {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String address;
//	private double rent;
//	private String status;
//	@Column(name="prop_add_date")
//	private LocalDate date;
//	@Enumerated(EnumType.STRING)
//	@Column(name="property_type",length = 20 )
//	private Type propertyType;
//	@Column(name="City",length=30)
//	private String city;
//	@OneToMany(mappedBy = "photoData",cascade = CascadeType.ALL,orphanRemoval = true)
//	  @JsonIgnoreProperties("photoData")
//	private List<PropertyPhotos>propertyphoto=new ArrayList<>();
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="owner_id")
//	@JsonIgnoreProperties("prolist")
//	//@JsonIgnore
//	private User ownerData;
//	@OneToMany(mappedBy="facilityData",cascade = CascadeType.ALL,orphanRemoval = true)
//	@JsonIgnoreProperties("facilityData")
//	//@JsonIgnore
//	   List<Facilities>facilityList=new ArrayList<>();
//	//@OneToMany(mappedBy = "propList",cascade = CascadeType.ALL,orphanRemoval = true)
//	//@JsonIgnoreProperties("propList")
//	//  private SeekerFavList favData;
//	
//	public PropertyDetails()
//     {
//    	 
//     }
//}
//
