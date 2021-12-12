package com.cleristonpereira.workshopconceptualmodeling.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleristonpereira.workshopconceptualmodeling.domain.Order;
import com.cleristonpereira.workshopconceptualmodeling.repositories.OrderRepository;
import com.cleristonpereira.workshopconceptualmodeling.services.exceptions.ObjectNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
		+ id + ", Tipo: " + Order.class.getName()));
	}
}
