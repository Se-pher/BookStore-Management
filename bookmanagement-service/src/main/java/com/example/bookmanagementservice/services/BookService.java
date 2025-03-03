package com.example.bookmanagementservice.services;

import com.example.bookmanagementservice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookmanagementservice.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook (Book book){
        return bookRepository.save(book);
    }

    public void deleteBook (Long id){
        bookRepository.deleteById(id);
    }
}
