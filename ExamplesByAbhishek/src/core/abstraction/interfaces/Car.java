package core.abstraction.interfaces;

public class Car {

	public static void main(String[] args) {
		RunnableEngine engine = getEngine(1);
		engine.run();
		System.out.println(engine instanceof RunnableEngine );
		}


	private static RunnableEngine getEngine(int x) {

		RunnableEngine fe = new FiatEngine("Diesel");
		RunnableEngine te = new ToyotaEngine("Diesel");

		if(x==1){
			return  fe;
		}else
			return te;

	}


}

