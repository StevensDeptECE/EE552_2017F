
public class X {
	public X() {
		System.out.println("A");		
	}
	// THIS IS NOT A CONSTRUCTOR!!!!
	public void X() {
		System.out.println("test");
	}
	public void finalize() {
		System.out.println("AAAAAAAAAAgh");
	}
	public static void f() {
		X a1 = new X();
		a1.X();		
	}
	public static void main(String[]args) {
		f();
		System.gc();
		Y y1 = new Y(1,2);
		Z z1 = new Z(3,4);
		System.out.println(y1);
		System.out.println(z1);
	}
}

class Y {
	private int a;
	public Y(int a) {
		this.a = a;
		System.out.print('y');
	}
	public Y(int a, int c) {
		this(a+c);
		System.out.print('z');
	}
	public String toString() {
		return "a=" + a;   // lookup DecimalFormat for more formatting
	}	
}

//class DOV extends BillGates, DonaldTrump, WarrenBuffet {
// in programming, we declare who our parents are!!!! 
class Z extends Y {
	private int b;
	public Z(int a, int b) {
		super(a);
		this.b = b;
	}
	public String toString() {
		return super.toString() + " b=" + b;   // lookup DecimalFormat for more formatting
	}	

}
