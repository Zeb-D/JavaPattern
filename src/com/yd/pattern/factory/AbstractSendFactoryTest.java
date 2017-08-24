package com.yd.pattern.factory;

public class AbstractSendFactoryTest {
	public static void main(String[] args) {
		AbstractSendFactory abstractFactory = new MailSenderFactory();
		Sender sender = abstractFactory.produce();
		sender.send();
	}
}
