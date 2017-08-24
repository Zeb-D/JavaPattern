package com.yd.pattern.bridge;

public class SourceSub1 implements Sourceable {  
	  
    @Override  
    public void method() {  
        System.out.println("this is the SourceSub1 method!");  
    }  
}  
