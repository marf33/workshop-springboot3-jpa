package com.softinsa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softinsa.course.entities.Order;
import com.softinsa.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	//Procurar todos os Orders
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	//Procurar Order por Id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
