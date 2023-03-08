package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Data;


@Entity
@Table(name = "users")
@Data
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
}
