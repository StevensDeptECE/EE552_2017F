
public class ObjectStructure {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B(1);
		C c1; // legal
		// ILLEGAL: C c2 = new C(); // create an object is called INSTANTIATION 
		//c2.f();
		D d1 = new D();// can create instance of D because f() is implemented
		d1.f();
		c1 = d1;
		c1.f(); // point to base class and execute derived method
		E e1;
		E e2 = new E(); //illegal, E is abstract
		F f1 = new F(); 
	}
}

class A {
}
class B {
	private int x;
	public B(int x) { this.x = x; }
}
interface C {  // parent or super class      Java: base class
	public void f();
}

class D implements C {
	
	public void f() { System.out.println("test"); }
}

abstract class E implements C {
	private int x;
	
	public E(int x) { this.x = x; }
}

class F extends E {
	public void f() { System.out.println("FINALLY!!!"); }
}


