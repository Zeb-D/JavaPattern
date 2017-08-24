package com.yd.pattern.factory;

public class MailSender implements Sender{

	public void send() {
		System.out.println(this.getClass().getSimpleName());
	}

}
