package com.example.harslundhorsemandshipback.about_me.services;

import com.example.harslundhorsemandshipback.about_me.models.AboutMe;

import java.util.List;
import java.util.Optional;

public interface AboutMeService {
    Optional<AboutMe> createAboutMe(AboutMe aboutMe);
    List<AboutMe> readAboutMe();
    Optional<AboutMe> updateAboutMe(AboutMe aboutMe);
    boolean deleteAboutMe(AboutMe aboutMe);
}
