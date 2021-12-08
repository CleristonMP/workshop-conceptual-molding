package com.cleristonpereira.workshopconceptualmodeling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleristonpereira.workshopconceptualmodeling.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
