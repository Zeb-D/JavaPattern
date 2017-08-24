package com.yd.pattern.singleton.threadSafe;

public class Singleton {
    private static Singleton instance = null;  
  
    private Singleton() {  
    }  
  
    public static synchronized Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }
    
    public static Singleton getInstance2() {  
        if (instance == null) {  
            synchronized (instance) {  
                if (instance == null) {  
                    instance = new Singleton();  
                }  
            }  
        } 
        return instance;  
    }
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return instance;  
    }  
}
