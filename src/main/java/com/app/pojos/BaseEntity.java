//package com.app.pojos;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@MappedSuperclass
////to specify that following class will not have any table , BUT will acts as a
//// common super class for all other entities
//public class BaseEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	public BaseEntity() {
//		super();
//	}
//	
//
//	public BaseEntity(Long id) {
//		super();
//		this.id = id;
//	}
//
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	@Override
//	public String toString() {
//		return "BaseEntity [id=" + id + "]";
//	}
//	
//	
//}
