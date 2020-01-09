package core.generics;

public class GenEx {

	public static void main(String[] args) {

		// An Object class's object can also hold any type of values within it. But
		// while using those values for further operations we will always have to
		// typecast them.

		Object o1 = new Integer(2);
		Object o2 = new Integer(3);

		// Integer sum1 = o1 +o2;
		// the above statement will generate the following error.
		// The operator + is undefined for the argument type(s) java.lang.Object,
		// java.lang.Object

		// the above error will be given by the compiler , we will need to typecast
		// variables to integer before we can use them
		String sum = String.valueOf((Integer) o1)  + String.valueOf((Integer) o2);
		System.out.println(sum);

		// There is no need to type cast the variables when using generics.

		TypeVar<String> tvi1 = new TypeVar<String>("1");
		TypeVar<String> tvi2 = new TypeVar<String>("2");

		String sumg = tvi1.getType() + tvi2.getType();
		System.out.println(sumg);

	}

}
