package com.cleristonpereira.workshopconceptualmodeling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleristonpereira.workshopconceptualmodeling.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
