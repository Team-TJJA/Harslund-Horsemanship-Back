package com.example.harslundhorsemandshipback.mail.controller;

import com.example.harslundhorsemandshipback.mail.model.EmailMessage;
import com.example.harslundhorsemandshipback.mail.service.EmailSenderService;
import jakarta.mail.MessagingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmailController {

    private EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }


    @PostMapping("/send-mail")
    public ResponseEntity<String> sendMimeMail(@RequestBody EmailMessage message) throws MessagingException {
        this.emailSenderService.sendMailMime(message);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success");
    }

}
