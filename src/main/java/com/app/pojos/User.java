package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Entity
@Table(name = "users")
public class User extends BaseEntity{

	@Column(name = "first_name", nullable = false, length = 30)
	private String first_name;

	@Column(name = "last_name", nullable = false, length = 30)
	private String last_name;
	
	@Column(name = "email", unique = true, nullable = false, length = 30)
	@Email
	private String email;

	@Column(name = "password", nullable = false, length = 30)
	private String password;

	@Column(name = "contact_number", nullable = false, length = 30)
	private String contact_number;

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private Role role;
	
	 @OneToMany(mappedBy = "ownerData",orphanRemoval = true)
	    @JsonIgnoreProperties("ownerData")
	    @JsonIgnore
	     private List<PropertyDetails>prolist=new ArrayList<PropertyDetails>();

	public User() {
		super();
	}

	public User(String first_name, String last_name, @Email String email, String password, String contact_number,
			Role role) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.contact_number = contact_number;
		this.role = role;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", contact_number="
				+ contact_number + ", role=" + role + "]";
	}
	
	
}

