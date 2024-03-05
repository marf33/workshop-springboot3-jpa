package com.softinsa.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softinsa.course.entities.Product;
import com.softinsa.course.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;
	
	@GetMapping
	//RespondeEntity retorna resposta de requisições web
	public ResponseEntity<List<Product>> findAll(){

		List<Product> list = service.findAll();
		//Retornar resposta OK no http
		return ResponseEntity.ok().body(list);
	}
	
	//Buscar user por Id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
