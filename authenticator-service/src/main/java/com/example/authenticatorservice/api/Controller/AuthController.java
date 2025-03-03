package com.example.authenticatorservice.api.Controller;

import com.example.authenticatorservice.model.Customer;
import com.example.authenticatorservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Customer> registerUser(@RequestBody Customer customer) {
        Customer savedUser = userService.registedUser(customer);
        return ResponseEntity.ok(savedUser);
    }
}
