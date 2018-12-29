package test_Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//·ºÐÍ
public class BasicGeneric {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		list1.add("one");
		list1.add("two");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		Set<String> set1 = new HashSet<String>();
		set1.add("1");
		set1.add("2");
		for(Iterator<String> i = set1.iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}
	
}

class  PersonName implements Comparable<PersonName> {
	
	int age;
	
	public int compareTo(PersonName pn) {
		if(this.age > pn.age) return 1;
		else if(this.age < pn.age) return -1;
		else return 0;
	}
}
