package com.example.bookmanagementservice.model;
/*
 * Author: Lê Quang Hưng
 * */

import jakarta.persistence.*;
import lombok.Data;

@Table (name = "categorys")
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;

}
