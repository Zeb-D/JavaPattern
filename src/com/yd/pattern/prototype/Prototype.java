package com.yd.pattern.prototype;

public class Prototype implements Cloneable {  
	  
    public Object clone() throws CloneNotSupportedException {  
        Prototype proto = (Prototype) super.clone();  
        return proto;  
    }  
}
/**
 * һ��ԭ���ֻ࣬��Ҫʵ��Cloneable�ӿڣ���дclone�������˴�clone�������Ըĳ���������ƣ���ΪCloneable�ӿ��Ǹ��սӿڣ�
 * ��������ⶨ��ʵ����ķ���������cloneA����cloneB����Ϊ�˴����ص���super.clone()��仰��
 * super.clone()���õ���Object��clone()����������Object���У�clone()��native�ģ�
 * ������ôʵ�֣��һ�����һƪ�����У����ڽ��Java�б��ط����ĵ��ã��˴��������
 * ��������ҽ���϶����ǳ���ƺ������˵һ�£�������Ҫ�˽�����ǳ���Ƶĸ��
 */
