package com.softinsa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softinsa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
