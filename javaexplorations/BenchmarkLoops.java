public class BenchmarkLoops {
	private int val;
	public static double sum(long n) {
		double s = 0;
		for (long i = 1; i <= n; i++)
			s += i;
		return s;
	}
	public void f() {
	}

	public int getVal() { return val; }

	public int getVal2() { return val++; }

	public BenchmarkLoops() {
		val = 2;
	}
	public static double sum2(long n) {
		double s = 0;
		BenchmarkLoops bl = new BenchmarkLoops();
		for (long i = 1; i <= n; i++) {
			s += i;
			bl.f();
		}
		return s;
	}
	public static double sum3(long n) {
		double s = 0;
		BenchmarkLoops b = new BenchmarkLoops();
		for (long i = 1; i <= n; i++) {
			s += b.getVal();
		}
		return s;
	}

	public static long sum4(long n) {
		long s = 0;
		BenchmarkLoops b = new BenchmarkLoops();
		for (long i = 1; i <= n; i++) {
			s += b.getVal2();
		}
		return s;
	}

	public static long sum5(long n) {
		long s = 0;
		for (long i = 1; i <= n; i++) {
			BenchmarkLoops b = new BenchmarkLoops();
			s += b.getVal2();
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		//System.out.println(sum(n));
		//System.out.println(sum2(n));
		//System.out.println(sum3(n));
		//		System.out.println(sum4(n));
		System.out.println(sum5(n));
	}
}
