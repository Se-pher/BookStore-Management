package com.example.authenticatorservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private String customerPassword;

}
