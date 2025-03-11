package org.me.learning.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailSenderService {

    @Autowired
    JavaMailSender javaMailSender ;

    public void sendEmail (String email , String subject , String body)
    {
        SimpleMailMessage  mailMessage =  new SimpleMailMessage();
        mailMessage.setFrom("");// this is for the sender email
        mailMessage.setTo(email);
        mailMessage.setText(body);
        mailMessage.setSubject(subject);
//       !   now all these should come from other classes and functions 

        javaMailSender.send(mailMessage);

    }


}
