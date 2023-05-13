package core.abstraction.interfaces;

public class FiatEngine implements RunnableEngine {

	String type;

	public FiatEngine(String t) {
		this.type = t;
	}

	public void run() {
		System.out.println("i'm a " + type + " engine from FIAT");
	}

}
