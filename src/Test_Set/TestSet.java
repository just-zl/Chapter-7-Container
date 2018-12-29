package Test_Set;

import java.util.*;

//Set接口  无序，不重复
public class TestSet {

	public static void main(String[] args) {
		/*Set set = new HashSet();
		set.add("hello");
		set.add("world");
		set.add("hello");
		System.out.println(set);  //相同对象不会打印出来（根据String重写的equals方法判断是否相同）
*/		
		Set<Object> s1 = new HashSet<>();
		Set<Object> s2 = new HashSet<>();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("b");s2.add("a");s2.add("d");
		
		Set<Object> set1 = new HashSet<>(s1);
		set1.retainAll(s2);  //求set1和s2的交集
		
		Set<Object> set2 = new HashSet<>(s1);
		set2.addAll(s2);
		
		System.out.println(set1);
		System.out.println(set2);
	}

}
