package core.polymorphism.overriding;

/**
 * This program aims at the method overloading.
 * 
 * Method overloading is used to achieve compile time polymorphism. The complier
 * know which of the to methods with the same name <start()> will be called at
 * the runtime.
 * 
 * 
 * @author abhishek.vishnoi
 *
 */
public class Run {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.start("GOLD");
		
		
		Vehicle bike = new Bike();
		bike.start();
		bike.start("GOLD");
		
		Bike bk1 = new Bike();
		
		bk1.start();
		bk1.start("GOLD");
		
	}
}
