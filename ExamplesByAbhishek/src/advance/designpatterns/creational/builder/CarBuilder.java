package advance.designpatterns.creational.builder;

public class CarBuilder {
	
	String fuelType;
	String engineType;
	Integer tyres;
	Integer passengers;
	String carNumber;
	
	public CarBuilder setFuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}
	
	public CarBuilder setEngineType(String engineType) {
		this.engineType = engineType;
		return this;
	}
	public CarBuilder setTyres(Integer tyres) {
		this.tyres = tyres;
		return this;
	}
	public CarBuilder setPassengers(Integer passengers) {
		this.passengers = passengers;
		return this;
	}
	public CarBuilder setCarNumber(String carNumber) {
		this.carNumber = carNumber;
		return this;
	}
	
	public Car getCar() {
		return new Car(fuelType,engineType,tyres, passengers,carNumber);
	}

}
