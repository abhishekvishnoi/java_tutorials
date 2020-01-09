package core.polymorphism.overriding;

public class Bike extends Vehicle {

	// @Override Indicates that a method declaration is intended to override
	// a method declaration in a super type.
	
	// This is a overridden method
	@Override
	public void start() {
		System.out.println("i'm a bike , i will start with a default key");
	}

	// This is a overloaded method
	public int start(String keyType, int tyres) {

		System.out.println("i'm a bike , i have " + tyres + "  tyres , and i will start with a " + keyType + " key");
		return 0;
	}

}
