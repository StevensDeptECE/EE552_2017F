package zoo;

// every Zebra >= 34 bytes
// 16 bytes (8 bytes of overhead)
public class Zebra {
	private String name; // --> 8 bytes overhead + 10 + 4
	private int age;
	private static int count = 0;
	public Zebra(String name) {
		this.name = name;
		this.age = Zoo.r.nextInt(6)+1;
		count++;
	}
	public void finalize() {
		count--;
	}
	public static int getCount() { return count; }
	//public int getCount() { return count; }
}
