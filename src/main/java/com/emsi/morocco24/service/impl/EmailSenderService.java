package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String toMail,
                         String subjec,
                         String body)
    {
        SimpleMailMessage message =new SimpleMailMessage();
        message.setFrom("kay.technologie.gdr@gmail.com");
        message.setTo(toMail);
        message.setText(body);
        message.setSubject(subjec);
        mailSender.send(message);
    }

}
