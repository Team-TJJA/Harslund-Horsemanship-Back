package com.example.harslundhorsemandshipback.about_me.repositories;

import com.example.harslundhorsemandshipback.about_me.models.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeRepository extends JpaRepository<AboutMe, Integer> {
}
