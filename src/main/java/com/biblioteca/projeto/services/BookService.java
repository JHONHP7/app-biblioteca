package com.biblioteca.projeto.services;

import com.biblioteca.projeto.models.BookEntity;
import com.biblioteca.projeto.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookEntity insert(BookEntity entity) {
        return bookRepository.save(entity);
    }
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

}
