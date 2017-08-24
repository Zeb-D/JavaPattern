package com.yd.pattern.command;

public class CommandTest {
	 public static void main(String[] args) {  
	        Receiver receiver = new Receiver();  
	        Command cmd = new MyCommand(receiver);  
	        Invoker invoker = new Invoker(cmd);  
	        invoker.action();  
	    }  
}
