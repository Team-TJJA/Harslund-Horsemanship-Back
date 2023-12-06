package com.example.harslundhorsemandshipback.mail.service;

import com.example.harslundhorsemandshipback.mail.model.EmailMessage;
import jakarta.mail.MessagingException;

public interface EmailSenderService {

    void sendMailMime(EmailMessage mail) throws MessagingException;
}
