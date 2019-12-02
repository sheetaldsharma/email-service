package com.eshopper.emailservice.listener;

import com.eshopper.emailservice.service.EmailService;
import org.apache.kafka.common.internals.Topic;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailListener {
    @Autowired
    EmailService emailService;



    @KafkaListener(topics = "SEND_ORDER_PLACED_MAIL", groupId = "group_id")
    public void sendMailOnOrderPlaced(String message)
    {
        System.out.println("-----------------------------------"+message);
        emailService.sendMail("tashidsharma@gmail.com","Test subject","Test mail1");

    }
}
