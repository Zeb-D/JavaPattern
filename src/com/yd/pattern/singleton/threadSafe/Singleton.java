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
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }  
}
