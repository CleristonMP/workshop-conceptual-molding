package com.cleristonpereira.workshopconceptualmodeling.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cleristonpereira.workshopconceptualmodeling.domain.Customer;
import com.cleristonpereira.workshopconceptualmodeling.domain.enums.CustomerType;

public class CustomerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	private String cpfOrCnpj;
	private Integer type;

	private List<AddressDTO> adresses = new ArrayList<>();
	
	private Set<String> phones = new HashSet<>();
	
	public CustomerDTO() {
	}

	public CustomerDTO(Long id, String name, String email, String cpfOrCnpj, Integer type) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpfOrCnpj = cpfOrCnpj;
		this.type = type;
	}

	public CustomerDTO(Customer entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.cpfOrCnpj = entity.getCpfOrCnpj();
		this.type = entity.getType().getCod();
		entity.getPhones().forEach(x -> this.phones.add(x));
		entity.getAdresses().forEach(x -> this.adresses.add(new AddressDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getCpfOrCnpj() {
		return cpfOrCnpj;
	}

	public void setCpfOrCnpj(String cpfOrCnpj) {
		this.cpfOrCnpj = cpfOrCnpj;
	}

	public CustomerType getType() {
		return CustomerType.toEnum(type);
	}

	public void setType(CustomerType type) {
		this.type = type.getCod();
	}

	public List<AddressDTO> getAdresses() {
		return adresses;
	}

	public Set<String> getPhones() {
		return phones;
	}
}
