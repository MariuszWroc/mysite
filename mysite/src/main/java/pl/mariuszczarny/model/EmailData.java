package pl.mariuszczarny.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Email;

public class EmailData implements Serializable{
    private static final long serialVersionUID = 1L;
	@Email
	@NotBlank
	private String sender;
	@NotBlank
	private String subject;
	@NotBlank
	private String body;
	private final String receiver  = "mariusz.zlatan@gmail.com";
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getReceiver() {
		return receiver;
	}

    @Override
    public String toString() {
        return "EmailDTO{" + "sender=" + sender + ", subject=" + subject + ", body=" + body + ", receiver=" + receiver + '}';
    }
        
}
