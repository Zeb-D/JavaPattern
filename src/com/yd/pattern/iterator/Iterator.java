package com.yd.pattern.iterator;

public interface Iterator {  
    //ǰ��  
    public Object previous();  
      
    //����  
    public Object next();  
    public boolean hasNext();  
      
    //ȡ�õ�һ��Ԫ��  
    public Object first();  
}  
