package test_Map;

import java.util.*;

//�ĳ��Զ���������
//����һ���ַ�����������ַ����ظ����ֵĴ���
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
			Integer temp = map.get(st[i]);  //�˴�map.get()���������ص���һ��Integer���͵ı���
			map.put(st[i],(temp == null ? ONE : temp+1));  //�Զ������͵�1�����Integer����
		}
		System.out.println(map.size());
		System.out.println(map);
	}

}
