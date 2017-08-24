package com.yd.pattern.factory;

public class MailSenderFactory implements AbstractSendFactory{
	public Sender produce() {
		return new MailSender();
	}
}
