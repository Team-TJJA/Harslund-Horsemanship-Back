package com.example.harslundhorsemandshipback.price.repositories;

import com.example.harslundhorsemandshipback.price.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
}
