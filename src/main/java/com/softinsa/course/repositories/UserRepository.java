package com.softinsa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softinsa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
