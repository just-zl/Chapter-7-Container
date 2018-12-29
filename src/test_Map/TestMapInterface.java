package test_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Map�ӿ�	 �Լ��Զ��������� + ����
public class TestMapInterface {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<>();
		Map<String,Integer> m2 = new TreeMap<>();
		
		//m1.put("one", new Integer(1));  //����������Ҫ�Ƕ��� 
		m1.put("one", 1);   //jdk1.5�Ժ����Զ����auto-boxing���Զ����auto-unboxing���ܽ�����ת��Ϊ�����������ͻ��෴ת��
		m1.put("two",2);
		m1.put("three", 3);
		
		m2.put("A",4);
		m2.put("B",5);
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(2));
		
		if(m1.containsKey("two")) {
			//int i = ((Integer)m1.get("two")).intValue();  //get()�������ص���һ��Object���ͣ���Ҫǿ��ת��
			int i = m1.get("two");  //�Զ����  get()���ص���һ��Integer����
			System.out.println(i);
		}
		
		Map<String,Integer> m3 = new HashMap<>(m1);
		m3.putAll(m2);
		System.out.println(m3);
		
	}

}
