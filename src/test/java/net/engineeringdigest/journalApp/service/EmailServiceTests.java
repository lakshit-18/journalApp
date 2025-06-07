package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail() {
        emailService.sendMail("oakastrologer43@gmail.com", "Testing the java mail sender", "Hi bhai kaise ho, sona mat ye project complete karna hai apne ko");
    }
}
