package test_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Map接口	 以及自动打包、解包 + 泛型
public class TestMapInterface {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<>();
		Map<String,Integer> m2 = new TreeMap<>();
		
		//m1.put("one", new Integer(1));  //两个参数需要是对象 
		m1.put("one", 1);   //jdk1.5以后有自动打包auto-boxing和自动解包auto-unboxing，能将对象转换为基础数据类型或相反转换
		m1.put("two",2);
		m1.put("three", 3);
		
		m2.put("A",4);
		m2.put("B",5);
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(2));
		
		if(m1.containsKey("two")) {
			//int i = ((Integer)m1.get("two")).intValue();  //get()方法返回的是一个Object类型，需要强制转换
			int i = m1.get("two");  //自动解包  get()返回的是一个Integer类型
			System.out.println(i);
		}
		
		Map<String,Integer> m3 = new HashMap<>(m1);
		m3.putAll(m2);
		System.out.println(m3);
		
	}

}
