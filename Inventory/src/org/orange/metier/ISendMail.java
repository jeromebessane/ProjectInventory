package org.orange.metier;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

public interface ISendMail {
	
	public void send_email(String from, String name_from, String to, String subject, String message) throws UnsupportedEncodingException, MessagingException;
}
