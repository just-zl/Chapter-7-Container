package test_List;

import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Object> list1 = new LinkedList<>();
		for(int i=0;i<=5;i++) {
			list1.add("a"+i);
		}
		System.out.println(list1);
		
		list1.set(2, "zl");  //���ر���zl������� Ԫ��
		System.out.println(list1);
		list1.add(3, "li");
		System.out.println(list1);
		System.out.println((String)list1.get(1));  //List�ӿڵ�get()���������ص���һ��Object���ͣ�����ǿ��ת����string����
		System.out.println(list1.indexOf("a5"));  //����ֵΪa5���±�
		list1.remove(0);
		System.out.println(list1);
	}

}
