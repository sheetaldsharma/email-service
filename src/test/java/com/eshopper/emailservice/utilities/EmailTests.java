package com.eshopper.emailservice.utilities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailTests {

    @Test
    public void sendMail()
    {
        Email email = new Email();
        //email.sendSimpleMail();
    }
}
