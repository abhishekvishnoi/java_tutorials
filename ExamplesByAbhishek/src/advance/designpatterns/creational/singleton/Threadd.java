package advance.designpatterns.creational.singleton;

public class Threadd  implements Runnable{

	@Override
	public void run() {
		
		System.out.println(" I want to create a new object.");
		//Connection conn = Connection.getInstance();
		//conn.connect();

		MySingleton myObj = MySingleton.getSingletonObj();
		myObj.printHello();
		
		
	}

}
