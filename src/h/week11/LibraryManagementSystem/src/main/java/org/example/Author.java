package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", columnDefinition = "serial")
    private long id;

    @Column(name = "author_name", length = 50, nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "author_birth_date")
    private Date birthDate;

    @Column(name = "author_country", length = 50)
    private String country;

    public Author(){

    }
}
