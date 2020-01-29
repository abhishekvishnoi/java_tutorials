package advance.designpatterns.creational.singleton;

public class Threadd  implements Runnable{

	@Override
	public void run() {
		
		System.out.println(" I want to create a new connection.");
		Connection conn = Connection.getInstance();
		conn.connect();
		
		
		
	}

}
