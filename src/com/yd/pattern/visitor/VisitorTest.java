package com.yd.pattern.visitor;

/**
 * ��ģʽ���ó��������������Ϊһ�����е��������¹��ܣ����ò����Ǽ������飺
 * <p>1���¹��ܻ᲻�������й��ܳ��ּ��������⣿
 * <p>2���Ժ�᲻������Ҫ��ӣ�
 * <p>3������಻�����޸Ĵ�����ô�죿
 * <p>�����Щ���⣬��õĽ����������ʹ�÷�����ģʽ��������ģʽ���������ݽṹ����ȶ���ϵͳ�������ݽṹ���㷨���
 */
public class VisitorTest {
	public static void main(String[] args) {  
        
        Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor);      
    }  
}
