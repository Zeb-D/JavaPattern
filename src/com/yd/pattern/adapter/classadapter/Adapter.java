package com.yd.pattern.adapter.classadapter;

public class Adapter extends Source implements Targetable{
	@Override  
    public void method2() {  
        System.out.println("this is the Adapter method2!");  
    }  
}
