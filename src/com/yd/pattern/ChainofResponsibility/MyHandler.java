package com.yd.pattern.ChainofResponsibility;

/**
 *此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，
 *<p>需要我们自己去实现，同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。
 */
public class MyHandler extends AbstractHandler implements Handler {  
	  
    private String name;  
  
    public MyHandler(String name) {  
        this.name = name;  
    }  
  
    @Override  
    public void operator() {  
        System.out.println(name+"deal!");  
        if(getHandler()!=null){  
            getHandler().operator();  
        }  
    }  
}  
