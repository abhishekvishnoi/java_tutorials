package core.inheritance.constructor.chaining.advance;

public class Bike extends Vehicle {

	public Bike() {

		System.out.println("i'm a bike");
	}

	public Bike(String name) {

		// if super is not called , the default constructor for super class wil be
		// invoked by default.

		// if super is used with params , the referenced constructor will be called.
		super(2);

		System.out.println("i'm a bike , my name is " + name);

		// Constructor call must be the first statement in a constructor
		// super(2);
	}
}
