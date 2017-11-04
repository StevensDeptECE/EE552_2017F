
public class Cubic {
	private double a, b, c, d;
	
	
	public Cubic(double ai, double bi, double ci, double di {
		a = ai; b = bi; c = ci; d = di;
	}
	public Cubic(double bi, double ci, double di {
		this(0, bi,ci,di);
	}

	public double eval(double x) {
//		return a * x*x*x + b * x*x + c* x + d;
		return ((a * x + b)*x + c)*x + d;
		//a*Math.pow(x, 15) + b*Math.pow(x, 14) + .x..	
	}
	public String toString() {
		StringBuilder b = new StringBuilder(40);
		if (a != 0) {
			b.append(a).append("x^3");
		}
		
		return b.toString();
	}
	public static void main(String[] args) {
		Cubic c1 = new Cubic(1, 2, 3, 4);
		Cubic c2 = new Cubic(2, 3, 4);
		System.out.println(c1.eval(2.0)); // print the answer
		System.out.println(c1);
	}
}
