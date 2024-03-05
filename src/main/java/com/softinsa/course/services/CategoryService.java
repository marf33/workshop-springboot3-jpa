package com.softinsa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softinsa.course.entities.Category;
import com.softinsa.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//Procurar todos os users
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	//Procurar user por Id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
