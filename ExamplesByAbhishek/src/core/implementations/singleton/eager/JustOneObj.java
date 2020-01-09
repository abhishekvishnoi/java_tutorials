package core.implementations.singleton.eager;

public class JustOneObj {

	static private final JustOneObj joo = new JustOneObj();
	
	private JustOneObj() {
		
	}
	
	public static JustOneObj getInstance() {
		
		return joo;
	}
	
}
