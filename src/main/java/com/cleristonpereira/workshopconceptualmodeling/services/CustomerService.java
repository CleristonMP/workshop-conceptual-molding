package com.cleristonpereira.workshopconceptualmodeling.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleristonpereira.workshopconceptualmodeling.domain.Customer;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CustomerRepository;
import com.cleristonpereira.workshopconceptualmodeling.services.exceptions.ObjectNotFoundException;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	@Transactional
	public Customer findById(Long id) {
		Optional<Customer> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
		+ id + ", Tipo: " + Customer.class.getName()));
	}
}
