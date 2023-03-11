package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.PropertyDetails;

public interface PropertyRepository extends JpaRepository<PropertyDetails, Long>  {

}
