package test_Collection;

public class Testty {
	public static void main(String args[]) {
		A a = new B();
		//B b = (B)a;
		//b.print();
		System.out.println(a instanceof B);
		System.out.println(a instanceof A);
	}
}

class A{
	
}
class B extends A {
	public void print() {
		
	}
}