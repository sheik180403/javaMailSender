package com.mail.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.mail.service.MailService;

@Component
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendOtp(String to, String otp) {
		SimpleMailMessage message=new SimpleMailMessage();
		 message.setFrom("playflixmailservice@gmail.com");
	        message.setTo(to);
	        message.setText("Hello!\n\nPlease following the one Time Password is "+ otp+".\nDon't share with anyone.\n\nThank you!");
	        message.setSubject("Email varification");
	        javaMailSender.send(message);
	        System.out.println("Mail Send...");
		
		
	}

}
