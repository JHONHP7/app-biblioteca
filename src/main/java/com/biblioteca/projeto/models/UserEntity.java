package com.biblioteca.projeto.models;

import com.biblioteca.projeto.models.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "USUARIO")
@Getter
@Setter
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 6144448313150202970L;
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "SOBRENOME")
    private String lastname;

    @Column(name = "SENHA")
    private String password;
}
