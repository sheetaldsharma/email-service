package com.eshopper.emailservice.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;


    @Test
    public void testEmail(){
        emailService.sendMail("tashidsharma@gmail.com","Test subject","Test mail1");
    }
}
