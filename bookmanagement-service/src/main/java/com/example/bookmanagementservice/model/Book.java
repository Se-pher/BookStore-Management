package com.example.bookmanagementservice.model;
/*
* Author: Lê Quang Hưng
* */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table(name= "book")
@Entity
@Data
public class Book {
    @Id
    private Long bookID;
    private String bookName;
    private String bookAuthor;
    private Float bookPrice;
    private Integer bookQuantity;
}
