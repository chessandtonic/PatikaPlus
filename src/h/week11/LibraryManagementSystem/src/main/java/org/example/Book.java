package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private long id;

    @Column(name = "book_name", length = 50, nullable = false)
    private String name;

    @Column(name = "publication_year")
    private int publicationYear;

    @Column(name = "book_stock", nullable = false)
    private int stock;

    public Book(){

    }
}
