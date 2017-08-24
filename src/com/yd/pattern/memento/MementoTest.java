package com.yd.pattern.memento;

/**
 * 新建原始类时，value被初始化为egg，后经过修改，将value的值置为niu，
 * <p>最后倒数第二行进行恢复状态，结果成功恢复了。其实我觉得这个模式叫“备份-恢复”模式最形象。
 */
public class MementoTest {
	public static void main(String[] args) {  
        
        // 创建原始类  
        Original origi = new Original("egg");  
  
        // 创建备忘录  
        Storage storage = new Storage(origi.createMemento());  
  
        // 修改原始类的状态  
        System.out.println("初始化状态为：" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("修改后的状态为：" + origi.getValue());  
  
        // 回复原始类的状态  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("恢复后的状态为：" + origi.getValue());  
    }  

}
