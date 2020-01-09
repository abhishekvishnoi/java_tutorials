package memory.string.pool.concat;

public class ExampleStringConcat2 {

	
	public static void main(String[] args) {
		
		
		// object will be created in String pool and Heap .
		// s1 will point to reference in Heap Memory
		String s1 = new String("a");
		
		// a new reference will be created in String pool ??
		// or
		// s2 will point to the same reference in in String pool created by s1.
		String s2 = "a";
		
		String s3 = "a";
		
       System.out.println(s1==s2);
       
       System.out.println(s3==s2);
		
	}
	
}
