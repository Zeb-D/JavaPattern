package com.yd.pattern.memento;

/**
 * �½�ԭʼ��ʱ��value����ʼ��Ϊegg���󾭹��޸ģ���value��ֵ��Ϊniu��
 * <p>������ڶ��н��лָ�״̬������ɹ��ָ��ˡ���ʵ�Ҿ������ģʽ�С�����-�ָ���ģʽ������
 */
public class MementoTest {
	public static void main(String[] args) {  
        
        // ����ԭʼ��  
        Original origi = new Original("egg");  
  
        // ��������¼  
        Storage storage = new Storage(origi.createMemento());  
  
        // �޸�ԭʼ���״̬  
        System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());  
  
        // �ظ�ԭʼ���״̬  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("�ָ����״̬Ϊ��" + origi.getValue());  
    }  

}
