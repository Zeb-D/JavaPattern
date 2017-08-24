package com.yd.pattern.ChainofResponsibility;

/**
 *�˴�ǿ��һ����ǣ������ϵ����������һ������������һ��������������һ������ģʽ����Լ�������
 *<p>��Ҫ�����Լ�ȥʵ�֣�ͬʱ����һ��ʱ�̣�����ֻ������һ�����󴫸���һ�����󣬶����������������
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
