package test_Collection;

import java.util.ArrayList;
import java.util.Collection;

//��ǿ��forѭ�������ǲ��Ƽ�ʹ�á���Ϊ��ֻ�Ǽ�����䣬��һЩ���õĹ��ܲ���ʵ�֡�����ȥ���±�Ϊ2��ֵ
//����������ô�õľ���
public class TestEnhancedFor {

	public static void main(String[] args) {
		int a[] = {1,2,3,6,3};
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		Collection c = new ArrayList();
		c.add(new String("zhang"));
		c.add(new String("li"));
		for(Object o:c) {
			System.out.print(o);
		}
	}

}
