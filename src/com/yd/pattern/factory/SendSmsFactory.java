package com.yd.pattern.factory;

public class SendSmsFactory implements AbstractSendFactory{
	public Sender produce() {
		return new SmsSender();
	}
}
