package com.cleristonpereira.workshopconceptualmodeling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleristonpereira.workshopconceptualmodeling.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
