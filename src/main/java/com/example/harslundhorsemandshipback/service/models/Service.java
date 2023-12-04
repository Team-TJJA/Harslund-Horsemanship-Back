package com.example.harslundhorsemandshipback.service.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int priority;
    @Column(columnDefinition = "TEXT")
    private String image;
    private String text;
    private String video;

}
