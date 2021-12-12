package com.cleristonpereira.workshopconceptualmodeling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleristonpereira.workshopconceptualmodeling.domain.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
