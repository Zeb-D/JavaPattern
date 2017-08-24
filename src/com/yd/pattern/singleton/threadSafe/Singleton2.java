package com.yd.pattern.singleton.threadSafe;

public class Singleton2 {  
	  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton2() {  
    }  
  
    /* �˴�ʹ��һ���ڲ�����ά������ */  
    private static class SingletonFactory {  
        private static Singleton2 instance = new Singleton2();  
    }  
  
    /* ��ȡʵ�� */  
    public static Singleton2 getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    }  
}  
