package com.example.harslundhorsemandshipback.practice.services;

import com.example.harslundhorsemandshipback.practice.models.Practice;

import java.util.List;
import java.util.Optional;

public interface PracticeService {
    Optional<Practice> createPractice(Practice practice);
    List<Practice> readPractices();
    Optional<Practice> updatePractice(Practice practice);
    boolean deletePractice(Practice practice);
}
