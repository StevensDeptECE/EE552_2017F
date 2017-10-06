public class Airplane {
	private double fuel;
	
	public Airplane(double fuel) {
		if (fuel < 0)
			throw new RuntimeException("Airplane must have fuel");
		this.fuel = fuel;
	}
	
	public void fly() {
		fuel --;
		if (fuel <= 0)
			crash();
		System.out.println("flying");
	}
	public void crash() {
		System.out.println("crash");
		throw new RuntimeException("crash");
	}
	
	public static void main(String[] args) {
		Airplane a = new Airplane(50);
		//for (;;)
		while (true)
			a.fly();
	}
}

