package cl.jagerbomb.emailsender.services.impl;

import cl.jagerbomb.emailsender.services.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Value("${spring.mail.username}")
    private String email;

    @Override
    public void sendSimpleEmail(String destiny) {
        destiny = "roguerrero.go@gmail.com";
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(destiny);
        message.setSubject("Envio de correo para prueba");
        message.setText("Texto de ejemplo");
        emailSender.send(message);
        log.debug("Correo enviado a ");
    }
}
