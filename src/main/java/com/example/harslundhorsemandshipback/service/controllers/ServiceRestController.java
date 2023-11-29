package com.example.harslundhorsemandshipback.service.controllers;

import com.example.harslundhorsemandshipback.service.models.Service;
import com.example.harslundhorsemandshipback.service.services.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @CrossOrigin
public class ServiceRestController {

    @Autowired
    private PracticeService practiceService;

    @PostMapping("/Teknikker")
    public ResponseEntity<?> postService(@RequestBody Service service){
        Optional<Service> newPractice = practiceService.createService(service);

        if (newPractice.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(newPractice.get());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Teknikker blev IKKE gemt!");
        }
    }

    @GetMapping("/Teknikker")
    public ResponseEntity<List<Service>> getServices(){
        List<Service> services = practiceService.readServices();

        if (!services.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(services);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(services);
        }
    }

    @PutMapping("/Teknikker")
    public ResponseEntity<?> putService(@RequestBody Service service){
        Optional<Service> practiceFound = practiceService.updateService(service);

        if (!practiceFound.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(service);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Teknikker blev IKKE opdateret!");
        }
    }

    @DeleteMapping("/Teknikker")
    public ResponseEntity<String> deleteService(@RequestBody Service service){
        boolean practiceFound = practiceService.deleteService(service);

        if (practiceFound){
            return ResponseEntity.status(HttpStatus.OK).body("Teknikken blev slettet.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Teknikken blev IKKE slettet!");
        }
    }
}
