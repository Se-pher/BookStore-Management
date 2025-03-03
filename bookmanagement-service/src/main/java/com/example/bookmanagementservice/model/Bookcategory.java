package com.example.bookmanagementservice.model;
/*
* Author: Lê Quang Hưng
*
* */

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Table (name = "bookcategory")
@Getter
@Setter
public class Bookcategory {
    @Id
    private Integer id;
    private Book bookID;
    private Category categoryID;
}
