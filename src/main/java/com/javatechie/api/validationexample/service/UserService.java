package com.javatechie.api.validationexample.service;

import com.javatechie.api.validationexample.dto.UserRequest;
import com.javatechie.api.validationexample.entity.User;
import com.javatechie.api.validationexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(UserRequest userRequest) {
        User user = User
                .build(0, userRequest.getName(), userRequest.getEmail(),
                        userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUser(int id) {
        return Optional.ofNullable(repository.findByUserId(id));
    }
}
