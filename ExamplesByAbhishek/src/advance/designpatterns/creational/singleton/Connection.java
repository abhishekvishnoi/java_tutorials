package advance.designpatterns.creational.singleton;

public class Connection {

	private volatile static Connection conn;

	private Connection() {

	}

	static Connection getInstance() {

		if (conn == null) {
			synchronized (Connection.class) {
				if (conn == null) {
					conn = new Connection();
					System.out.println("Creating new object");
				} else {
					System.out.println("Giving an object that is already created for Singleton");
				}
			}
		} else {
			System.out.println("Giving an object that is already created for Singleton");
		}

		return conn;

	}

	public void connect() {
		System.out.println(" The connection is established.");
	}

}
