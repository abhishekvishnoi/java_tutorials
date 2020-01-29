package advance.designpatterns.creational.singleton;

public class Main {

	
	public static void main(String[] args) {
		

     Thread t1 = new Thread(new Threadd());
     
     t1.run();
     
     Thread t2 = new Thread(new Threadd());
		
     t2.run();
	}
}
