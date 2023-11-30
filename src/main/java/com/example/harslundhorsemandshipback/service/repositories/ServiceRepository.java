package com.example.harslundhorsemandshipback.service.repositories;

import com.example.harslundhorsemandshipback.service.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
