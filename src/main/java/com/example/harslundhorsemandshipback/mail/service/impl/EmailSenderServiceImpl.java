package com.example.harslundhorsemandshipback.mail.service.impl;

import com.example.harslundhorsemandshipback.mail.model.AutoReply;
import com.example.harslundhorsemandshipback.mail.model.CustomerMessage;
import com.example.harslundhorsemandshipback.mail.model.EmailMessage;
import com.example.harslundhorsemandshipback.mail.service.EmailSenderService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender mailSender;

    @Value("${EMAIL}")
    private String ownersMail;

    public EmailSenderServiceImpl(JavaMailSender javaMailSender) {
        this.mailSender = javaMailSender;
    }

    public void sendMailMime(EmailMessage mail) throws MessagingException {
        //CustomerMessage is a custom class that contains the html and css. Information received from customer.
        CustomerMessage customerMessage = new CustomerMessage();
        customerMessage.setReply(mail.getReply());
        customerMessage.setSubject(mail.getSubject());
        customerMessage.setNumber(mail.getNumber());
        customerMessage.setMessage(mail.getMessage());

        //MimeMessage is a class in the JavaMail API that represents an email message.
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true);

        message.setFrom(ownersMail);
        message.setTo(ownersMail);
        message.setReplyTo(mail.getReply());
        message.setSubject(mail.getSubject());
        message.setText(customerMessage.buildCustomerMessage(), true);

        mailSender.send(mimeMessage);

        //Sends reply message to customer confirming the mail has been received.
        //AutoReply is a custom class that holds the html and css for an auto reply to the customer.
        AutoReply autoReply = new AutoReply();

        message.setReplyTo(ownersMail);
        message.setTo(mail.getReply());
        message.setSubject(autoReply.autoReplySubjectField() + mail.getSubject());
        message.setText(autoReply.buildAutoReply(), true);

        mailSender.send(mimeMessage);
    }
}