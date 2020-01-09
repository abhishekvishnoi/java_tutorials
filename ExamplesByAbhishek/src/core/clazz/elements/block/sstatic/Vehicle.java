package core.clazz.elements.block.sstatic;

public class Vehicle {

	String type;

	// this is an instance block
	static {
		System.out.println("static block is executed.");
	}

	public Vehicle(String t) {
		this.type = t;
	}

	public void run() {

		System.out.println("a " + type + " type vehicle is running.");
	}

}
