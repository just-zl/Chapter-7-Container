package test_Collection;

import java.util.*;


public class TestCollection2 {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        l1.add(new Name2("li", "zhang"));
        l1.add(new Name2("gang", "wu"));
        l1.add(new Name2("yu", "yuan"));
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
    }
}
 
class Name2 implements Comparable {
    private String firstName, lastName;
 
    public Name2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
    
    //��дtoString����
    public String toString() {
        return firstName + " " + lastName;
    }
 
   /* //��д����Object��equals����
   public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name2 name = (Name2) obj;  //��Ȼ�Ѿ���Name���ˣ�Ϊʲô��Ҫǿ��ת����Name��
            return (firstName.equals(name.firstName))
                    && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }
    
    //�ǣ���дequals������ʱ��Ҳ��Ҫ��дhashcode����
   public int hashCode() {
        return firstName.hashCode(); // ��д equals ��������Ҫ��д hashCode ������ ���� Name �����������Ϊ����,key��ʱ�򣬾�Ҫ�õ� hashCode
    }*/
 
    public int compareTo(Object o) {
        Name2 n = (Name2) o;
        int lastCmp = lastName.compareTo(n.lastName); // ����String��� compareTo ����
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
 
}



