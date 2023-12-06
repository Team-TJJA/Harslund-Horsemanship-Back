package com.example.harslundhorsemandshipback.price.controllers;

import com.example.harslundhorsemandshipback.price.models.Price;
import com.example.harslundhorsemandshipback.price.services.impl.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @CrossOrigin
public class PriceRestController {

    @Autowired
    private PriceService priceService;

    @PostMapping("/priser")
    public ResponseEntity<?> postPrice(@RequestBody Price price){
        Optional<Price> newPrice = priceService.createPrice(price);

        if (newPrice.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(newPrice.get());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Priser blev IKKE gemt!");
        }
    }

    @GetMapping("/priser")
    public ResponseEntity<List<Price>> getPrices(){
        List<Price> prices = priceService.readPrices();

        if (!prices.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(prices);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(prices);
        }
    }

    @PutMapping("/priser")
    public ResponseEntity<?> putPrices(@RequestBody Price price){
        Optional<Price> priceFound = priceService.updatePrice(price);

        if (!priceFound.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(price);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Priser blev IKKE opdateret!");
        }
    }

    @DeleteMapping("/priser")
    public ResponseEntity<String> deletePrice(@RequestBody Price price){
        boolean priceFound = priceService.deletePrice(price);

        if (priceFound){
            return ResponseEntity.status(HttpStatus.OK).body("Prisen blev slettet.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prisen blev IKKE slettet!");
        }
    }
}
