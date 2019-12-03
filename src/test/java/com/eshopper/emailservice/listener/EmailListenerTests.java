package com.eshopper.emailservice.listener;

import com.eshopper.emailservice.service.EmailService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Consumer;

import static org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest.to;

@EmbeddedKafka(partitions = 1, topics = { "SEND_ORDER_PLACED_MAIL" })
@SpringBootTest
public class EmailListenerTests {



}
