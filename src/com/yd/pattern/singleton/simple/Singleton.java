package com.yd.pattern.singleton.simple;

public class Singleton {
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
    private static Singleton instance = null;  
  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  
    /* ��̬���̷���������ʵ�� */  
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return instance;  
    }  
}
