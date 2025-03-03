package com.example.authenticatorservice.model;
/*
 * Author: Lê Quang Hưng
 * */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table (name = "order")
@Data
@Entity

public class Order {
    @Id
    private Integer orderId;
    private String orderTotalPrice;
    private Integer customerId;
}
