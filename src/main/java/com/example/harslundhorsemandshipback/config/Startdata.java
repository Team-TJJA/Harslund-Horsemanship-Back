package com.example.harslundhorsemandshipback.config;

import com.example.harslundhorsemandshipback.practice.models.Practice;
import com.example.harslundhorsemandshipback.practice.repositories.PracticeRepository;
import com.example.harslundhorsemandshipback.service.models.Service;
import com.example.harslundhorsemandshipback.service.repositories.ServiceRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startdata implements CommandLineRunner {

    @Autowired
    PracticeRepository practiceRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public void run(String... args) throws Exception {

        /*------------------------------------- SERVICES EXAMPLES--------------------------------- */
        // Example 1
        Service service1 = new Service();
        service1.setText("Heste message");
        service1.setPriority(1);
        service1.setImage("https://i.pinimg.com/originals/12/1e/66/121e6645ef7bd81c4045affa9554e7f9.jpg");
        serviceRepository.save(service1);


        // Example 2
        Service service2 = new Service();
        service2.setText("Equine Nutrition Consultation");
        service2.setPriority(2);
        service2.setImage("https://example.com/nutrition_image.jpg");
        serviceRepository.save(service2);

        // Example 3
        Service service3 = new Service();
        service3.setText("Show Jumping Training");
        service3.setPriority(3);
        service3.setImage("https://example.com/show_jumping_image.jpg");
        serviceRepository.save(service3);

        // Example 4
        Service service4 = new Service();
        service4.setText("Equine Dental Care");
        service4.setPriority(4);
        service4.setImage("https://example.com/dental_care_image.jpg");
        serviceRepository.save(service4);

        // Example 5
        Service service5 = new Service();
        service5.setText("Therapeutic Riding Sessions");
        service5.setPriority(5);
        service5.setImage("https://example.com/therapeutic_riding_image.jpg");
        serviceRepository.save(service5);

        /*------------------------------------- PRACTICES EXAMPLES--------------------------------- */

        // Practice for Horse Massage
        Practice practice1 = new Practice();
        practice1.setText("Our certified massage therapists use a combination of Swedish and deep tissue massage techniques, focusing on key muscle groups to improve circulation and reduce tension.");
        practice1.setPriority(1);
        practice1.setImage("https://example.com/horse_massage_detail_image.jpg");
        practiceRepository.save(practice1);

        // Practice for Equine Nutrition Consultation
        Practice practice2 = new Practice();
        practice2.setText("Our certified massage therapists use a combination of Swedish and deep tissue massage techniques, focusing on key muscle groups to improve circulation and reduce tension.");
        practice2.setPriority(2);
        practice2.setImage("https://example.com/nutrition_detail_image.jpg");
        practiceRepository.save(practice2);

        // Practice for Show Jumping Training
        Practice practice3 = new Practice();
        practice3.setText("Show jumping training emphasizes a progressive approach to jumping techniques. Our trainers focus on building a strong foundation of basic skills, including approach, takeoff, and landing, to ensure a successful and safe jumping experience.");
        practice3.setPriority(3);
        practice3.setImage("https://example.com/show_jumping_detail_image.jpg");
        practiceRepository.save(practice3);

        // Practice for Equine Dental Care
        Practice practice4 = new Practice();
        practice4.setText("Equine dental care involves routine check-ups and specialized treatments. Our practitioners perform dental examinations, floating, and corrective procedures to maintain your horse's oral health.");
        practice4.setPriority(4);
        practice4.setImage("https://example.com/dental_care_detail_image.jpg");
        practiceRepository.save(practice4);

        // Practice for Therapeutic Riding Sessions
        Practice practice5 = new Practice();
        practice5.setText("Therapeutic riding sessions are tailored to address specific emotional and mental well-being goals. Our certified therapists use a combination of riding exercises and horse interactions to promote healing and personal growth.");
        practice5.setPriority(5);
        practice5.setImage("https://example.com/therapeutic_riding_detail_image.jpg");
        practiceRepository.save(practice5);

    }
}
