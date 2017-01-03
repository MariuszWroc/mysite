package pl.mariuszczarny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

    @Autowired
    private MailSender mailSender;

    private SimpleMailMessage simpleMessage;

    @Value("${send.from.email}")
    private String fromEmail;

    @Value("${send.to.email}")
    private String toEmail;

    @RequestMapping("/send.html")
    public String send(Model model){
        System.out.println("Starting Send...");
        String response = "OK";
        this.simpleMessage = new SimpleMailMessage();

        this.simpleMessage.setSubject("Dinner Party");
        this.simpleMessage.setFrom(this.fromEmail);
        this.simpleMessage.setTo(this.toEmail);

        SimpleMailMessage msg = new SimpleMailMessage(this.simpleMessage);
        msg.setText("Please come for dinner tonight.");

        try{
            this.mailSender.send(msg);
        }
        catch(MailException ex){
            response = "NO_OK";
            System.err.println(ex.getMessage());
        }
        System.out.println("Finished Send...");
        return "OK";
    }

}