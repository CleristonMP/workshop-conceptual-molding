package com.cleristonpereira.workshopconceptualmodeling.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleristonpereira.workshopconceptualmodeling.domain.Order;
import com.cleristonpereira.workshopconceptualmodeling.services.OrderService;

@RestController
@RequestMapping(value = "/ordereds")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
