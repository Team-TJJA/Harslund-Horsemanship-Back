package com.example.harslundhorsemandshipback.about_me.controllers;

import com.example.harslundhorsemandshipback.about_me.models.AboutMe;
import com.example.harslundhorsemandshipback.about_me.services.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @CrossOrigin
public class AboutMeRestController {

    @Autowired
    private AboutMeService aboutMeService;

    @PostMapping("/om_mig")
    public ResponseEntity<?> postAboutMe(@RequestBody AboutMe aboutMe){
        Optional<AboutMe> newPractice = aboutMeService.createAboutMe(aboutMe);

        if (newPractice.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(newPractice.get());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Om mig blev IKKE gemt!");
        }
    }

    @GetMapping("/om_mig")
    public ResponseEntity<List<AboutMe>> getAboutMe(){
        List<AboutMe> aboutMes = aboutMeService.readAboutMe();

        if (!aboutMes.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(aboutMes);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(aboutMes);
        }
    }

    @PutMapping("/om_mig")
    public ResponseEntity<?> putAboutMe(@RequestBody AboutMe aboutMe){
        Optional<AboutMe> practiceFound = aboutMeService.updateAboutMe(aboutMe);

        if (!practiceFound.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(aboutMe);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Om mig blev IKKE opdateret!");
        }
    }

    @DeleteMapping("/om_mig")
    public ResponseEntity<String> deleteAboutMe(@RequestBody AboutMe aboutMe){
        boolean practiceFound = aboutMeService.deleteAboutMe(aboutMe);

        if (practiceFound){
            return ResponseEntity.status(HttpStatus.OK).body("Om mig blev slettet.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Om mig blev IKKE slettet!");
        }
    }
}
