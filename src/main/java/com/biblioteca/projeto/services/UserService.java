package com.biblioteca.projeto.services;

import com.biblioteca.projeto.models.BookEntity;
import com.biblioteca.projeto.models.UserEntity;
import com.biblioteca.projeto.repositories.BookRepository;
import com.biblioteca.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity insert(UserEntity entity) {
        return userRepository.save(entity);
    }
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

}
