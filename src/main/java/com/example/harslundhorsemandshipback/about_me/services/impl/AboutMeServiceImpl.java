package com.example.harslundhorsemandshipback.about_me.services.impl;

import com.example.harslundhorsemandshipback.about_me.models.AboutMe;
import com.example.harslundhorsemandshipback.about_me.repositories.AboutMeRepository;
import com.example.harslundhorsemandshipback.about_me.services.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AboutMeServiceImpl implements AboutMeService {
    @Autowired
    AboutMeRepository aboutMeRepository;

    @Override
    public Optional<AboutMe> createAboutMe(AboutMe aboutMe){
        return Optional.of(aboutMeRepository.save(aboutMe));
    }

    @Override
    public List<AboutMe> readAboutMe(){
        return aboutMeRepository.findAll();
    }

    @Override
    public Optional<AboutMe> updateAboutMe(AboutMe aboutMe){
        Optional<AboutMe> aboutFound = aboutMeRepository.findById(aboutMe.getId());

        if(aboutFound.isPresent()){
            return Optional.of(aboutMeRepository.save(aboutMe));
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteAboutMe(AboutMe aboutMe){
        Optional<AboutMe> aboutFound = aboutMeRepository.findById(aboutMe.getId());

        if(aboutFound.isPresent()){
            aboutMeRepository.delete(aboutFound.get());
            return true;
        }
        return false;
    }
}
