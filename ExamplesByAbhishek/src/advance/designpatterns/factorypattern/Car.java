package advance.designpatterns.factorypattern;

public class Car {

	private String engineType;

	Car(String eT) {
		this.engineType = eT;
	}

	public void startCar() {

		Engine engine = null;

//		if (engineType == "FiatEngine") {
//			engine = new FiatEngine();
//		} else if (engineType == "ToyotaEngine") {
//			engine = new ToyotaEngine();
//		}
		
		SimpleEngineFactory sef = new SimpleEngineFactory();
		engine = sef.getEngine(engineType);
		
		engine.runEngine();
		
		

	}

}
