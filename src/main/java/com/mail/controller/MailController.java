package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mail.entity.MailEntity;
import com.mail.serviceimpl.MailServiceImpl;

@RestController
public class MailController {
	
		@Autowired
		private MailServiceImpl mailServiceImpl;
		
		@PostMapping()
		public void otp(@RequestBody MailEntity mailEntity) {
			mailServiceImpl.sendOtp(mailEntity.getTo(),mailEntity.getOtp());

		}

}
