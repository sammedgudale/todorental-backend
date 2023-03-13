package com.app.pojos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "users")
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name="userName",nullable = false)
    private String name;
	@Column(name="userEmail",unique=true,nullable = false)
    private String email;
	@Column(nullable = false)
    private String password;
	@Column(name="contact_number",nullable = false)
    private String contactNo;
	@Column(nullable = false)
    private String address;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String adharCard;
     @Lob
     @JsonIgnore
    private byte[] photo;
     
    @OneToMany(mappedBy = "ownerData",orphanRemoval = true)
    @JsonIgnoreProperties("ownerData")
    @JsonIgnore
     private List<PropertyDetails>prolist=new ArrayList<PropertyDetails>();
    
    public User()
    {
    	
    }
	public User(String name, String email, String password, String contactNo, String address, Role role,
			String adharCard) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.address = address;
		this.role = role;
		this.adharCard=adharCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}


	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public List<PropertyDetails> getProlist() {
		return prolist;
	}

	public void setProlist(List<PropertyDetails> prolist) {
		this.prolist = prolist;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", contactNo="
				+ contactNo + ", address=" + address + ", role=" + role + "]";
	}
    
}
