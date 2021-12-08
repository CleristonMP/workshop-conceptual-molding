package com.cleristonpereira.workshopconceptualmodeling;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cleristonpereira.workshopconceptualmodeling.domain.Category;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CategoryRepository;

@SpringBootApplication
public class WorkshopConceptualModelingApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(WorkshopConceptualModelingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		repository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
