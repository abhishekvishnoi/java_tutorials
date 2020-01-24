package advance.designpatterns.builderpattern;

public class Car implements Vehicle {

	String fuelType;
	String engineType;
	Integer tyres;
	Integer passengers;
	String carNumber;

	public Car(String fuelType, String engineType, Integer tyres, Integer passengers, String carNumber) {
		super();
		this.fuelType = fuelType;
		this.engineType = engineType;
		this.tyres = tyres;
		this.passengers = passengers;
		this.carNumber = carNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Integer getTyres() {
		return tyres;
	}

	public void setTyres(Integer tyres) {
		this.tyres = tyres;
	}

	public Integer getPassengers() {
		return passengers;
	}

	public void setPassengers(Integer passengers) {
		this.passengers = passengers;
	}

	@Override
	public void run() {
		System.out.println("Car is now running");

	}

}
