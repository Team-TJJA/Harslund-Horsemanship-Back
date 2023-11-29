package com.example.harslundhorsemandshipback.price.services;

import com.example.harslundhorsemandshipback.price.models.Price;
import com.example.harslundhorsemandshipback.price.repositories.PriceRepository;
import com.example.harslundhorsemandshipback.price.services.impl.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceRepository priceRepository;

    @Override
    public Optional<Price> createPrice(Price price){
        return Optional.of(priceRepository.save(price));
    }

    @Override
    public List<Price> readPrices(){
        return priceRepository.findAll();
    }

    @Override
    public Optional<Price> updatePrice(Price price){
        Optional<Price> practiceFound = priceRepository.findById(price.getId());

        if(practiceFound.isPresent()){
            return Optional.of(priceRepository.save(price));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletePrice(Price price){
        Optional<Price> practiceFound = priceRepository.findById(price.getId());

        if(practiceFound.isPresent()){
            priceRepository.delete(practiceFound.get());
            return true;
        }
        return false;
    }
}
