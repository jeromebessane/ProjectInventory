package org.orange.metier;

import java.io.UnsupportedEncodingException;

import javax.mail.*;
import javax.mail.internet.*;

public class SendMail implements ISendMail {
	 
	public void send_email(String from, String name_from, String to, String subject, String message) throws UnsupportedEncodingException, MessagingException{
			String serverSTMP = "172.26.11.39"; 
					 
			java.util.Properties props = new java.util.Properties();
			props.setProperty("mail.smtp.host", serverSTMP);
			Session session = Session.getDefaultInstance(props);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from, name_from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);
			Transport.send(msg);
			System.out.println("Message send !");
		}	
}

