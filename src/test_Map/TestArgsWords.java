package test_Map;

import java.util.*;

//改成自动打包、解包
//计算一个字符串数组里，各字符串重复出现的次数
public class TestArgsWords {
	
	//public static final Integer ONE = new Integer(1);
	public static final int ONE = 1;
	
	public static void main(String[] args) {
		/*Map map = new HashMap();
		for (int i=0;i<args.length;i++) {
			//Integer freq = (Integer)map.get(args[i]);
			//map.put(args[i],(freq == null ? ONE : (new Integer(freq.intValue()+1))));
			
			int freq = (Integer)map.get(args[i]) == null ? 0 : (Integer)map.get(args[i]);
			map.put(args[i],(freq == 0 ? ONE : freq+1));
			
			//Integer freq = (Integer)map.get(args[i]);
			//map.put(args[i],(freq == null ? ONE : freq+1));
		}
		System.out.println(map.size());
		System.out.println(map);*/
		
		Map<String, Integer> map = new HashMap<>();
		String st[] = {"aaa","bb","aaa","c","aaa","c"};
		for(int i=0;i<st.length;i++) {
			Integer temp = map.get(st[i]);  //此处map.get()方法，返回的是一个Integer类型的变量
			map.put(st[i],(temp == null ? ONE : temp+1));  //自动将整型的1打包成Integer对象
		}
		System.out.println(map.size());
		System.out.println(map);
	}

}
