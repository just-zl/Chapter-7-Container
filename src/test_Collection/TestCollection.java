package test_Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class TestCollection {
    public static void main(String[] args) {
        Collection c = new HashSet();
 
        c.add(new Name("Yan","Zhang"));
        c.add(new Name("Li","Zhang"));
        c.add(new Name("Hang","Zhang"));
        Iterator i = c.iterator();
        while(i.hasNext()) {
        	Name n = (Name)i.next();  //hasNext()方法返回的是一个Object类型，需要转换为相应类型
        	System.out.println(n.getFirstName()+" ");  //会自动调用Name的toString方法
        }
        for(Iterator j = c.iterator();j.hasNext();) {
        	Name n = (Name)j.next();
        	if(n.getFirstName().length()<3) {
        		j.remove();
        		//c.remove(n);  //会产生例外，Iterator循环内部执行了锁定，只能用自己（iterator）的方法
        	}
        }
        System.out.println(c);
    }
}
 
class Name  {
    private String firstName, lastName;
 
    public Name(String firstName, String lastName) {
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

}


/*import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestCollection {
    public static void main(String[] args) {
        Collection c = new HashSet();
 
        c.add("hello");  
        c.add(new Name("Li","Zhang"));
        c.add(new Integer(100));
        c.remove("hello");
        //c.remove(new Integer(100));
        
        System.out.println(c.remove(new Name("Li","Zhang")));  //remove方法能返回一个boole类型的值
        System.out.println(c.size());
        System.out.println(c);
    }
}
 
class Name  {
    private String firstName, lastName;
 
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
    
 
    //重写父类Object的equals方法   
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name) obj; 
            return (firstName.equals(name.firstName))
                    && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }
    
    //记：凡是把类对象放到以哈希表为内部存储结构的容器中，相应的类必须要实现equals方法和hashCode方法，这样才符合哈希表真实的逻辑功能. 
    public int hashCode() {
        return firstName.hashCode(); // 重写 equals 方法必须要重写 hashCode 方法， 当你 Name 类这个对象作为索引,key的时候，就要用到 hashCode
    }
}
*/



