package com.example.harslundhorsemandshipback.service.controllers;

import com.example.harslundhorsemandshipback.service.models.Service;
import com.example.harslundhorsemandshipback.service.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @CrossOrigin
public class ServiceRestController {

    @Autowired
    private ServiceService serviceService;

    @PostMapping("/ydelser")
    public ResponseEntity<?> postService(@RequestBody Service service){
        Optional<Service> newService = serviceService.createService(service);

        if (newService.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(newService.get());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ydelsen blev IKKE gemt!");
        }
    }

    @GetMapping("/teknikker")
    public ResponseEntity<List<Service>> getServices(){
        List<Service> services = serviceService.readServices();

        if (!services.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(services);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(services);
        }
    }

    @PutMapping("/teknikker")
    public ResponseEntity<?> putService(@RequestBody Service service){
        Optional<Service> serviceFound = serviceService.updateService(service);

        if (!serviceFound.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(service);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ydelser blev IKKE opdateret!");
        }
    }

    @DeleteMapping("/teknikker")
    public ResponseEntity<String> deleteService(@RequestBody Service service){
        boolean serviceFound = serviceService.deleteService(service);

        if (serviceFound){
            return ResponseEntity.status(HttpStatus.OK).body("Ydelsen blev slettet.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ydelsen blev IKKE slettet!");
        }
    }
}
