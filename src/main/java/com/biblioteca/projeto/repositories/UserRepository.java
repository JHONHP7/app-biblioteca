package com.biblioteca.projeto.repositories;

import com.biblioteca.projeto.models.BookEntity;
import com.biblioteca.projeto.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
