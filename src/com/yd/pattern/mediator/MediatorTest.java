package com.yd.pattern.mediator;

public class MediatorTest {
	public static void main(String[] args) {  
        Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll();  
    } 
}
