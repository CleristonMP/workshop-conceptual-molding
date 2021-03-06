package com.cleristonpereira.workshopconceptualmodeling.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleristonpereira.workshopconceptualmodeling.domain.Category;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CategoryRepository;
import com.cleristonpereira.workshopconceptualmodeling.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado! Id: " 
		+ id + ", Tipo: " + Category.class.getName()));
	}
}
