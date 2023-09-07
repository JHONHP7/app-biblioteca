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
@Table(name = "LIVRO")
@Getter
@Setter
public class BookEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -4625943681774406866L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "AUTOR")
    private String author;

    @Column(name = "TITULO")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORIA")
    private CategoryEnum category;
}
