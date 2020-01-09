package core.abstraction.interfaces;

public class ToyotaEngine implements Engine {

	String type;

	public ToyotaEngine(String t) {
		this.type = t;
	}

	@Override
	public void run() {
		System.out.println("i'm a " + type + " engine from Toyota");
	}

}
