package com.cleristonpereira.workshopconceptualmodeling.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cleristonpereira.workshopconceptualmodeling.domain.Customer;
import com.cleristonpereira.workshopconceptualmodeling.domain.dto.CustomerDTO;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CustomerRepository;
import com.cleristonpereira.workshopconceptualmodeling.services.exceptions.DatabaseException;
import com.cleristonpereira.workshopconceptualmodeling.services.exceptions.ResourceNotFoundException;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Page<CustomerDTO> findAllPaged(Pageable pageable) {
		Page<Customer> page = repository.findAll(pageable);
		return page.map(x -> new CustomerDTO(x));
	}
	
	public CustomerDTO findById(Long id) {
		Optional<Customer> obj = repository.findById(id);
		Customer entity = obj.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado! Id: " 
		+ id + ", Tipo: " + Customer.class.getName()));
		return new CustomerDTO(entity);
	}
	
	@Transactional
	public CustomerDTO insert(CustomerDTO dto) {
		Customer entity = new Customer();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new CustomerDTO(entity);
	}
	
	@Transactional
	public CustomerDTO update(Long id, CustomerDTO dto) {
		try {
			Customer entity = repository.getById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new CustomerDTO(entity);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	private void copyDtoToEntity(CustomerDTO dto, Customer entity) {
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setCpfOrCnpj(dto.getCpfOrCnpj());
		entity.setType(dto.getType());
	}
}
