package com.cleristonpereira.workshopconceptualmodeling.domain.dto;

import java.io.Serializable;

import com.cleristonpereira.workshopconceptualmodeling.domain.Address;
import com.cleristonpereira.workshopconceptualmodeling.domain.City;


public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private Long id;
	private String publicPlace;
	private String number;
	private String complement;
	private String district;
	private String zipCode;
	
	private City city;
	
	public AddressDTO() {
	}

	public AddressDTO(Long id, String publicPlace, String number, String complement, String district, 
			String zipCode, City city) {
		this.id = id;
		this.publicPlace = publicPlace;
		this.number = number;
		this.complement = complement;
		this.district = district;
		this.zipCode = zipCode;
		this.setCity(city);
	}
	
	public AddressDTO(Address entity) {
		this.id = entity.getId();
		this.publicPlace = entity.getPublicPlace();
		this.number = entity.getNumber();
		this.complement = entity.getComplement();
		this.district = entity.getDistrict();
		this.zipCode = entity.getZipCode();
		this.setCity(entity.getCity());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
