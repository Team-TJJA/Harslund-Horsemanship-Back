package com.example.harslundhorsemandshipback.price.services.impl;

import com.example.harslundhorsemandshipback.price.models.Price;

import java.util.List;
import java.util.Optional;

public interface PriceService {
    Optional<Price> createPrice(Price price);
    List<Price> readPrices();
    Optional<Price> updatePrice(Price price);
    boolean deletePrice(Price price);
}
