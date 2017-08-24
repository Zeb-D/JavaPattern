package com.yd.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.yd.pattern.factory.MailSender;
import com.yd.pattern.factory.Sender;
import com.yd.pattern.factory.SmsSender;

public class Builder {  
    
    private List<Sender> list = new ArrayList<Sender>();  
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }
    
    public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(10);  
    }
}  
