package com.arjuncodes.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
@ComponentScan
public class EmailSenderService {
	
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    public EmailSenderService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    
    public void sendSimpleEmail(String toEmail,String subject,String body) {
    	System.out.println("Mail Send...");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("panjavinod99@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);
        System.out.println(message.toString());
        mailSender.send(message);
        System.out.println("Mail Send...");
        }

 }

