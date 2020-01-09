package core.clazz.elements.block.instance;

public class Vehicle {

	
	String type;
	
	// this is an instance block
	{
		System.out.println("instance block ins executed.");
	}
	
	public Vehicle(String t) {
		this.type = t;
	}
	
	public void run() {
		
		
		System.out.println("a " + type + " type vehicle is running." );
	}
	
}
