package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", columnDefinition = "serial")
    private long id;

    @Column(name = "category_name", length = 50, nullable = false )
    private String name;

    @Column(name = "category_description", length = 50)
    private String description;

    public Category() {
    }
}
