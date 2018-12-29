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
    
    //重写toString方法
    public String toString() {
        return firstName + " " + lastName;
    }
 
   /* //重写父类Object的equals方法
   public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name2 name = (Name2) obj;  //既然已经是Name类了，为什么还要强制转换成Name类
            return (firstName.equals(name.firstName))
                    && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }
    
    //记：重写equals方法的时候，也需要重写hashcode方法
   public int hashCode() {
        return firstName.hashCode(); // 重写 equals 方法必须要重写 hashCode 方法， 当你 Name 类这个对象作为索引,key的时候，就要用到 hashCode
    }*/
 
    public int compareTo(Object o) {
        Name2 n = (Name2) o;
        int lastCmp = lastName.compareTo(n.lastName); // 调用String类的 compareTo 方法
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
 
}



