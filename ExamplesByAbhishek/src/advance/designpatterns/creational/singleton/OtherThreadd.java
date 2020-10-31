package advance.designpatterns.creational.singleton;

public class OtherThreadd implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Im other thread I want to create a new object.");
		//Connection conn = Connection.getInstance();
		//conn.connect();

		//MySingleton myObj = MySingleton.
		//myObj.printHello();

		MySingleton obj = MySingleton.getMySingleton();
		obj.printHello();

	}

}
