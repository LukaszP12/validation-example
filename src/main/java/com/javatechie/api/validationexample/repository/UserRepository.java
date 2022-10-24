package com.javatechie.api.validationexample.repository;

import com.javatechie.api.validationexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
