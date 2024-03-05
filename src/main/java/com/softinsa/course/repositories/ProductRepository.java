package com.softinsa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softinsa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
