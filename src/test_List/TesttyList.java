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
		fillDemo(list,"dd",1,2);//��list�����в���Ԫ���滻��
		//Collections.fill(list,"mm",2,3);
	}
	
	public static void fillDemo(List<String> list,String str,int start,int end) {
		//����list�е�subList������
		List<String> sublist = list.subList(start,end);
		//��sublist��ȫ���滻Ϊstr��
		Collections.fill(sublist,str);
		print(list);
	}
	public static void print(Object obj){
		System.out.println(obj);
	}

}
