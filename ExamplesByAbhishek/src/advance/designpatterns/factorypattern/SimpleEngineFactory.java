package advance.designpatterns.factorypattern;

public class SimpleEngineFactory {
	
	Engine getEngine(String engineType) {
		
		Engine engine = null;
 		
		if (engineType == "FiatEngine") {
			engine = new FiatEngine();
		} else if (engineType == "ToyotaEngine") {
			engine = new ToyotaEngine();
		}
		
		return engine;
	}

}
