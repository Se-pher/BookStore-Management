package com.example.authenticatorservice.service;

import com.example.authenticatorservice.model.Customer;
import com.example.authenticatorservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Customer registedUser(Customer customer){
        return userRepository.save(customer);

    }
    public Optional<Customer> findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
