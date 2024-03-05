package com.softinsa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softinsa.course.entities.Product;
import com.softinsa.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//Procurar todos os users
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	//Procurar user por Id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
