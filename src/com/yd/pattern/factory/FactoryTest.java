package com.yd.pattern.factory;

public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produce(new SmsSender());
		sender.send();
	}
}
