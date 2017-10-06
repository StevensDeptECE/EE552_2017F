public class PassengerPlane extends Airplane {
	public void serveCoffee() {
		System.out.println("coffee or tea?");
	}
	public PassengerPlane(double fuel) {
		super(fuel);
	}
	public static void main(String[] args) {
		Airplane a = new Airplane(50);
		a.fly();
		PassengerPlane p = new PassengerPlane(60);
		p.fly();
		p.serveCoffee();
		
	}
}
