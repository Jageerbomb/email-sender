package cl.jagerbomb.emailsender.controllers;

import cl.jagerbomb.emailsender.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping()
    public ResponseEntity<?> send(@RequestHeader String email) {
        emailService.sendSimpleEmail(email);
        return null;
    }
}