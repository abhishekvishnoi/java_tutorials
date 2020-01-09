package core.polymorphism.overriding;

public class Vehicle {

	public Vehicle() {
		System.out.println("i'm vehicle");
	}

	public Vehicle(int tyres) {
		System.out.println("i'm vehicle , i have " + tyres + " tyres");
	}

	public void start() {
		System.out.println("i will now start by default IRON key");
	}
	
	public int start(String keyType) {
		System.out.println("i will now start by a " + keyType + " key");
		return 0;
	}
}
