package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id", columnDefinition = "serial")
    private long id;

    @Column(name = "publisher_name", length = 50, nullable = false)
    private String name;

    @Column(name = "publisher_est_date")
    private int estYear;

    @Column(name = "publisher_address", length = 100)
    private String address;

    public Publisher(){

    }
}
