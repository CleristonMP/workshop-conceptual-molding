package com.cleristonpereira.workshopconceptualmodeling;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cleristonpereira.workshopconceptualmodeling.domain.Address;
import com.cleristonpereira.workshopconceptualmodeling.domain.Category;
import com.cleristonpereira.workshopconceptualmodeling.domain.City;
import com.cleristonpereira.workshopconceptualmodeling.domain.Customer;
import com.cleristonpereira.workshopconceptualmodeling.domain.Product;
import com.cleristonpereira.workshopconceptualmodeling.domain.State;
import com.cleristonpereira.workshopconceptualmodeling.domain.enums.CustomerType;
import com.cleristonpereira.workshopconceptualmodeling.repositories.AddressRepository;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CategoryRepository;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CityRepository;
import com.cleristonpereira.workshopconceptualmodeling.repositories.CustomerRepository;
import com.cleristonpereira.workshopconceptualmodeling.repositories.ProductRepository;
import com.cleristonpereira.workshopconceptualmodeling.repositories.StateRepository;

@SpringBootApplication
public class WorkshopConceptualModelingApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(WorkshopConceptualModelingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		State st1 = new State(null, "Minas Gerais");
		State st2 = new State(null, "São Paulo");
		
		City c1 = new City(null, "Uberlândia", st1);
		City c2 = new City(null, "São Paulo", st2);
		City c3 = new City(null, "Campinas", st2);
		
		st1.getCities().addAll(Arrays.asList(c1));
		st2.getCities().addAll(Arrays.asList(c2, c3));
		
		stateRepository.saveAll(Arrays.asList(st1, st2));
		cityRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Customer cli1 = new Customer(null, "Maria Silva", "maria@gmail.com", "15935724688", CustomerType.PESSOA_FISICA);
		cli1.getPhones().addAll(Arrays.asList("32325656", "99887755"));
		
		Address e1 = new Address(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Address e2 = new Address(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		
		cli1.getAdresses().addAll(Arrays.asList(e1, e2));
		
		customerRepository.saveAll(Arrays.asList(cli1));
		addressRepository.saveAll(Arrays.asList(e1, e2));
	}
}
