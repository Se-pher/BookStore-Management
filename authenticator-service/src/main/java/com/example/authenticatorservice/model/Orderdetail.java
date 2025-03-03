package com.example.authenticatorservice.model;
/*
 * Author: Lê Quang Hưng
 * */

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table (name = "orderdetail")
@Data
public class Orderdetail {
    @Id
    private Integer Id;
    private Integer orderId;
    private Integer customerId;
}
