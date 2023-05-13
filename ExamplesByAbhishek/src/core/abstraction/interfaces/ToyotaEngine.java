package core.abstraction.interfaces;

public class ToyotaEngine implements RunnableEngine {

	String type;

	public ToyotaEngine(String t) {
		this.type = t;
	}

	public void run() {
		System.out.println("i'm a " + type + " engine from Toyota");
	}

}
