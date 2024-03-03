package com.mail.service;

import org.springframework.stereotype.Service;

@Service
public interface MailService {
	
	void sendOtp(String to,String otp);
}
