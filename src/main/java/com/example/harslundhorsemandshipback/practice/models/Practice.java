package com.example.harslundhorsemandshipback.practice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Practice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private int priority;
    @Column(columnDefinition = "TEXT")
    private String image;
    private String video;

}
