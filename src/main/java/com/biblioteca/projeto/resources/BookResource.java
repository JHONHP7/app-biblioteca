package com.biblioteca.projeto.resources;

import com.biblioteca.projeto.models.BookEntity;
import com.biblioteca.projeto.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookResource {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookEntity> insert(@RequestBody BookEntity entity) {
        BookEntity savedEntity = bookService.insert(entity);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEntity.getId())
                .toUri();
        return ResponseEntity.created(uri).body(savedEntity);
    }

    @GetMapping
    public ResponseEntity<List<BookEntity>> findAll() {
        List<BookEntity> list = bookService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
