package com.yd.pattern.factory;

public class SmsSender implements Sender{

	public void send() {
		System.out.println(this.getClass().getSimpleName());
	}

}
