package pl.mariuszczarny.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import pl.mariuszczarny.model.EmailData;

@Service
public class EmailSenderService {
	private static final Logger logger = LoggerFactory.getLogger(EmailSenderService.class); 
	
	@Autowired
	private MailSender sender;
        
    public void sendMail(EmailData email) {
        SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom(email.getSender());
		message.setTo(email.getReceiver());
		message.setSubject(email.getSubject());
		message.setText(email.getBody());

		sendMessage(message);
		
		logger.info("Sent message successfully....");
    }

	private void sendMessage(SimpleMailMessage message) {
		try {
			logger.info("Email with subject = " + message.getSubject() + " from addres " + message.getFrom() + " to "+ message.getTo() + " was send");
			sender.send(message);
		} catch (MailException e) {
			logger.error(e.getMessage(), e);
		}
	}
    
	public void setMailSender(MailSender mailSender) {
		this.sender = mailSender;
	}
}

