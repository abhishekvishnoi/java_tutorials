package core.abstraction.interfaces;

public class FiatEngine implements Engine {

	String type;

	public FiatEngine(String t) {
		this.type = t;
	}

	@Override
	public void run() {
		System.out.println("i'm a " + type + " engine from FIAT");
	}

}
