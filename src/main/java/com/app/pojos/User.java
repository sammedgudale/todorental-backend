package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity{

	@Column(name = "user_name", nullable = false, length = 30)
	private String name;

	@Column(name = "email", unique = true, nullable = false, length = 30)
	@Email
	private String email;

	@Column(name = "password", nullable = false, length = 30)
	private String password;

	@Column(name = "contact_number", nullable = false, length = 30)
	private String contactNo;

	@Column(nullable = false, length = 60)
	private String address;

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private Role role;

	@Lob
	@JsonIgnore
	private byte[] photo;

//	    @OneToMany(mappedBy = "ownerData",orphanRemoval = true)
//	    @JsonIgnoreProperties("ownerData")
//	    @JsonIgnore
//	    private List<PropertyDetails>prolist=new ArrayList<PropertyDetails>();

}
