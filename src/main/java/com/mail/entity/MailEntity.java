package com.mail.entity;

import javax.persistence.Entity;

@Entity
public class MailEntity {
	
	private String to;
	private String otp;
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
}
