package com.example.harslundhorsemandshipback.practice.repositories;

import com.example.harslundhorsemandshipback.practice.models.Practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<Practice, Integer> {
}
