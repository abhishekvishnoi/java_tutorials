package advance.designpatterns.creational.factory;

public class Run {

	public static void main(String[] args) {
		
		String engineType = "FiatEngine";
		
		Car car = new Car(engineType);
		
		car.startCar();
		
	}
	
}
