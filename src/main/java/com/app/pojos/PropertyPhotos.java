package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Property_photos")
public class PropertyPhotos extends BaseEntity {
	
	@Lob
	private byte[] photos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="property_id")
	@JsonIgnoreProperties("propertyphoto")
    @JsonIgnore
	private PropertyDetails photoData;
}
