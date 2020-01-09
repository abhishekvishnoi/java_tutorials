package core.generics;

/**
 * <T> defines an abstract / generic type of the variable . The type of the
 * variable can be determined when we will reate the object for the class Type.
 * 
 * 
 * @author abhishek.vishnoi
 *
 * @param <T>
 */
public class TypeVar<T> {

	// A type which is not know at the time of writing the code , and will be
	// resolved at the run time can be achieved by the Generics.
	// Java generics provide us with the ability to create type safe generic
	// containers for referal types.
	T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	public TypeVar(T t) {
		this.type = t;
	}

}
