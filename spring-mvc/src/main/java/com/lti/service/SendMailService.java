package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
	
	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private SimpleMailMessage message;
	
	public void send(String email, String sub, String msg) {
		message.setTo(email); //set a proper recipient of the mail
		message.setSubject(sub);
		message.setText(msg);
		mailSender.send(message);
	}

}
