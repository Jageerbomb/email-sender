package cl.jagerbomb.emailsender;

import cl.jagerbomb.emailsender.services.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSenderApplicationTests {

    @Autowired
    private EmailService emailService;

    @Test
    void sendSimpleEmail() {
        emailService.sendSimpleEmail();
    }

}
