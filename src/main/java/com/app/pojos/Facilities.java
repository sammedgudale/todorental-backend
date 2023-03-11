package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Property_facilities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Facilities extends BaseEntity {

	@Column(length = 25)
	private String furnished;
	
	@Column(length = 25)
	private String semifurnished;
	
	@Column(length = 25, name = "security_gurad")
	private String securityGuard;
	
	@Column(length = 25)
	private String lift;
	
	@Column(length = 25)
	private String cctv;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "propertyid")
	@JsonIgnoreProperties("facilityList")
	@JsonIgnore
	private PropertyDetails facilityData;
}
