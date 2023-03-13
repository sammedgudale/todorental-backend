package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Property_photos")
public class PropertyPhotos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Lob
	private byte[] photos;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="propertyid")
	 @JsonIgnoreProperties("propertyphoto")
     @JsonIgnore
	 private PropertyDetails photoData;
	
    public PropertyPhotos()
    {
    	
    }

	public PropertyPhotos(byte[] photos, PropertyDetails photoData) {
		super();
		this.photos = photos;
		this.photoData = photoData;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getPhotos() {
		return photos;
	}

	public void setPhotos(byte[] photos) {
		this.photos = photos;
	}

	public PropertyDetails getPhotoData() {
		return photoData;
	}

	public void setPhotoData(PropertyDetails photoData) {
		this.photoData =photoData;
	}

	@Override
	public String toString() {
		return "PropertyPhotos [id=" + id + "]";
	}
    
}
