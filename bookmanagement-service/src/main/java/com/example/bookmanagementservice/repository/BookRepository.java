package com.example.bookmanagementservice.repository;

import com.example.bookmanagementservice.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
Page<Book> findAll( Pageable pageable);


    @Query(value = "SELECT * FROM book ", nativeQuery = true)
    Page<Book> findBook (Pageable pageable);
}
