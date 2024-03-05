package com.softinsa.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softinsa.course.entities.Order;
import com.softinsa.course.services.OrderService;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;
	
	@GetMapping
	//RespondeEntity retorna resposta de requisições web
	public ResponseEntity<List<Order>> findAll(){

		List<Order> list = service.findAll();
		//Retornar resposta OK no http
		return ResponseEntity.ok().body(list);
	}
	
	//Buscar user por Id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
