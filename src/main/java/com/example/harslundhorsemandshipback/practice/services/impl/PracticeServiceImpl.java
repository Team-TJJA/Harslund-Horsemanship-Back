package com.example.harslundhorsemandshipback.practice.services.impl;

import com.example.harslundhorsemandshipback.practice.models.Practice;
import com.example.harslundhorsemandshipback.practice.repositories.PracticeRepository;
import com.example.harslundhorsemandshipback.practice.services.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PracticeServiceImpl implements PracticeService {
    @Autowired
    PracticeRepository practiceRepository;

    @Override
    public Optional<Practice> createPractice(Practice practice){
        return Optional.of(practiceRepository.save(practice));
    }

    @Override
    public List<Practice> readPractices(){
        return practiceRepository.findAll();
    }

    @Override
    public Optional<Practice> updatePractice(Practice practice){
        Optional<Practice> practiceFound = practiceRepository.findById(practice.getId());

        if(practiceFound.isPresent()){
            return Optional.of(practiceRepository.save(practice));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletePractice(Practice practice){
        Optional<Practice> practiceFound = practiceRepository.findById(practice.getId());

        if(practiceFound.isPresent()){
            practiceRepository.delete(practiceFound.get());
            return true;
        }
        return false;
    }
}
