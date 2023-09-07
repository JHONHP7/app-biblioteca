package com.biblioteca.projeto.resources;

import com.biblioteca.projeto.models.BookEntity;
import com.biblioteca.projeto.models.UserEntity;
import com.biblioteca.projeto.services.BookService;
import com.biblioteca.projeto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> insert(@RequestBody UserEntity entity) {
        UserEntity savedEntity = userService.insert(entity);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEntity.getId())
                .toUri();
        return ResponseEntity.created(uri).body(savedEntity);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> findAll() {
        List<UserEntity> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
