package test_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesttyList {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		list.add("zhang");
		list.add("li");
		System.out.println(list.get(0));
*/
		List<String> list = new ArrayList<String>();
		list.add("aaaaa");
		list.add("bbbbb");
		list.add("ccccc");
		list.add("ddddd");
		list.add("fffff");
		fillDemo(list,"dd",1,2);//将list集合中部分元素替换。
		//Collections.fill(list,"mm",2,3);
	}
	
	public static void fillDemo(List<String> list,String str,int start,int end) {
		//调用list中的subList方法。
		List<String> sublist = list.subList(start,end);
		//将sublist中全部替换为str。
		Collections.fill(sublist,str);
		print(list);
	}
	public static void print(Object obj){
		System.out.println(obj);
	}

}
