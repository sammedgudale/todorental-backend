//package com.app.pojos;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.Lob;
//import javax.persistence.Table;
//import javax.validation.constraints.Email;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//
//@Entity
//@Table(name = "users")
//@Data
//public class User extends BaseEntity{
//
//	@Column(name = "first_name", nullable = false, length = 30)
//	private String first_name;
//
//	@Column(name = "last_name", nullable = false, length = 30)
//	private String last_name;
//	
//	@Column(name = "email", unique = true, nullable = false, length = 30)
//	@Email
//	private String email;
//
//	@Column(name = "password", nullable = false, length = 30)
//	private String password;
//
//	@Column(name = "contact_number", nullable = false, length = 30)
//	private String contact_number;
//
//	@Enumerated(EnumType.STRING)
//	@Column(length = 30)
//	private Role role;
//
//	@Lob
//	@JsonIgnore
//	private byte[] photo;
//
//
//}

package com.app.pojos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.NoArgsConstructor;
@Entity
@Table(name = "users_project")
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name="userName",nullable = false)
    private String name;
	@Column(name="userEmail",unique=true,nullable = false)
    private String email;
	@Column(nullable = false)
    private String password;
	@Column(name="contact_num",nullable = false)
    private String contactNo;
	@Column(nullable = false)
    private String address;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String adharCard;
     @Column(name="account_num")
    private String accountNum;
     @Lob
     @JsonIgnore
    private byte[] photo;
//    @OneToMany(mappedBy = "ownerData",orphanRemoval = true)
//    @JsonIgnoreProperties("ownerData")
//    @JsonIgnore
//     private List<PropertyDetails>prolist=new ArrayList<PropertyDetails>();
//    public Users()
//    {
//    	
//    }
	public User(String name, String email, String password, String contactNo, String address, Role role,
			String accountNum,String adharCard) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.address = address;
		this.role = role;
		this.accountNum = accountNum;
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

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
//	public List<PropertyDetails> getProlist() {
//		return prolist;
//	}
//
//	public void setProlist(List<PropertyDetails> prolist) {
//		this.prolist = prolist;
//	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", contactNo="
				+ contactNo + ", address=" + address + ", role=" + role + ",  accountNum=" + accountNum + "]";
	}
    
}

