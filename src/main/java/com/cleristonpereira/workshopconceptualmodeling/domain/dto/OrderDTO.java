package com.cleristonpereira.workshopconceptualmodeling.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.cleristonpereira.workshopconceptualmodeling.domain.Address;
import com.cleristonpereira.workshopconceptualmodeling.domain.Customer;
import com.cleristonpereira.workshopconceptualmodeling.domain.Order;
import com.cleristonpereira.workshopconceptualmodeling.domain.OrderItem;
import com.cleristonpereira.workshopconceptualmodeling.domain.Payment;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private Long id;
	private Date instant;
	
	private Payment payment;
	
	private Customer customer;
	
	private Address deliveryAddress;

	private Set<OrderItem> items = new HashSet<>();
	
	public OrderDTO() {
	}

	public OrderDTO(Long id, Date instant, Customer customer, Address deliveryAddress) {
		this.id = id;
		this.instant = instant;
		this.customer = customer;
		this.deliveryAddress = deliveryAddress;
	}
	
	public OrderDTO(Order entity) {
		this.id = entity.getId();
		this.instant = entity.getInstant();
		this.customer = entity.getCustomer();
		this.deliveryAddress = entity.getDeliveryAddress();
		entity.getItems().forEach(x -> this.items.add(x));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInstant() {
		return instant;
	}

	public void setInstant(Date instant) {
		this.instant = instant;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	public Set<OrderItem> getItems() {
		return items;
	}
}
