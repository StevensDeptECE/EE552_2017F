package zoo;
import java.util.*;

public class Zoo {
	public static Random r = new Random(5);
	public static void test1() {
		for (int i = 0; i < 1000000; i++) {
/			Zebra z1 = new Zebra("Alice");
			Zebra z2 = new Zebra("Samir");
		}
	}
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(Zebra.getCount());
			test1();
		}
		System.gc();
//		System.out.println(Zebra.count);
		System.out.println(Zebra.getCount());
	
	}
}
