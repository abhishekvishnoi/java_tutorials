package advance.designpatterns.builderpattern;

public class Run {

	public static void main(String[] args) {

		// restriction over creation of object
		Car car = new Car("petrol", "fiat", 4, 5, "UP21AJ9252");
		car.run();

		CarBuilder cb = new CarBuilder();
		Car carb = cb.setFuelType("petrol").setCarNumber("Up21AJ9252").setEngineType("Fiat").getCar();
		car.run();
	}

}
