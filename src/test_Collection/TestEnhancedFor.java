package test_Collection;

import java.util.ArrayList;
import java.util.Collection;

//增强的for循环，但是不推荐使用。因为他只是简化了语句，而一些常用的功能不好实现。比如去除下标为2的值
//明白他是怎么用的就行
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
