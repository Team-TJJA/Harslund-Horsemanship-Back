package com.example.harslundhorsemandshipback.price.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TEXT")
    private String text;

}
