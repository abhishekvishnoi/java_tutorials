package core.implementations.singleton.lazy;

public class Main {
	
	public static void main(String[] args) {
		
		JustOneObj joo = JustOneObj.getInstance();
		
		JustOneObj joo1 = JustOneObj.getInstance();
	
		System.out.println(joo==joo1);
	}

}
