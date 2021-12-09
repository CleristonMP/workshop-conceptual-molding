package com.cleristonpereira.workshopconceptualmodeling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleristonpereira.workshopconceptualmodeling.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
