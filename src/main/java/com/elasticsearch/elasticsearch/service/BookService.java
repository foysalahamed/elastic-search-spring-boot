package com.elasticsearch.elasticsearch.service;

import com.elasticsearch.elasticsearch.model.Book;
import com.elasticsearch.elasticsearch.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book findById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

//    public List<Book> findByTitle(String title) {
//        return bookRepository.findByTitle(title);
//    }

    // other CRUD operations
}