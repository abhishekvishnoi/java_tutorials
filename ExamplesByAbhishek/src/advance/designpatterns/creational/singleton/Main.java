package advance.designpatterns.creational.singleton;

import java.util.Collection;

public class Main {


	public static void main(String[] args) {

	    for (int i=0;i<=5 ; i++){

        }

        Thread t1 = new Thread(new Threadd());
        t1.run();

        Thread t2 = new Thread(new OtherThreadd());
        t2.run();
	}
}
