package com.softinsa.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softinsa.course.entities.Category;
import com.softinsa.course.services.CategoryService;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	//RespondeEntity retorna resposta de requisições web
	public ResponseEntity<List<Category>> findAll(){

		List<Category> list = service.findAll();
		//Retornar resposta OK no http
		return ResponseEntity.ok().body(list);
	}
	
	//Buscar user por Id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
