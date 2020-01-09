package core.abstraction.interfaces;

public class Car {

	public static void main(String[] args) {

		Engine fe = new FiatEngine("Petrol");
		fe.run();

		Engine te = new ToyotaEngine("Diesel");
		te.run();
		
	}

}
