package com.example.harslundhorsemandshipback.practice.controllers;

import com.example.harslundhorsemandshipback.practice.models.Practice;
import com.example.harslundhorsemandshipback.practice.services.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @CrossOrigin
public class PracticeRestController {

    @Autowired
    private PracticeService practiceService;

    @PostMapping("/ydelser")
    public ResponseEntity<?> postPractice(@RequestBody Practice practice){
        Optional<Practice> newPractice = practiceService.createPractice(practice);

        if (newPractice.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(newPractice.get());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ydelser blev IKKE gemt!");
        }
    }

    @GetMapping("/ydelser")
    public ResponseEntity<List<Practice>> getPractices(){
        List<Practice> practices = practiceService.readPratices();

        if (!practices.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(practices);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(practices);
        }
    }

    @PutMapping("/ydelser")
    public ResponseEntity<?> putPractice(@RequestBody Practice practice){
        Optional<Practice> practiceFound = practiceService.updatePractice(practice);

        if (!practiceFound.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(practice);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ydelser blev IKKE opdateret!");
        }
    }

    @DeleteMapping("/ydelser")
    public ResponseEntity<String> deletePractice(@RequestBody Practice practice){
        boolean practiceFound = practiceService.deletePractice(practice);

        if (practiceFound){
            return ResponseEntity.status(HttpStatus.OK).body("Ydelsen blev slettet.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ydelsen blev IKKE slettet!");
        }
    }
}
