package com.example.harslundhorsemandshipback.about_me.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AboutMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TEXT")
    private String text;
}
