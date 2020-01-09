package core.implementations.singleton.lazy;

public class JustOneObj {

	static private JustOneObj joo;

	private JustOneObj() {

	}

	public static JustOneObj getInstance() {

		if (joo == null) {

			joo = new JustOneObj();
		}

		return joo;

	}

}
