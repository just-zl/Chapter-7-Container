package test_List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestList2 {

	public static void main(String[] args) {
		List l1 = new LinkedList();
		for(int i=0;i<9;i++) {
			l1.add("a"+i);
		}
		System.out.println(l1);
		
		Collections.shuffle(l1);  //Ëæ»úÅÅÁÐ
		System.out.println(l1);
		Collections.reverse(l1);  //ÄæÐò
		
		Collections.sort(l1);  //ÅÅÐò
		System.out.println(Collections.binarySearch(l1, "a8"));  //ÕÛ°ë²éÕÒ
		
		Collections.fill(l1, "zl");
		System.out.println(l1);
	}

}
