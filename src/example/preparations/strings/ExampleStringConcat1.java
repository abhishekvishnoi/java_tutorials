package example.preparations.strings;

public class ExampleStringConcat1 {

	
	public static void main(String[] args) {
		
		// String literal created in String pool
		String s1 = "a";
		// s2 refers s1 already created in String pool
		String s2 = "a";
		
		
		// references for s1 and s2 will be same .
		System.out.println(s1==s2);
		
		//equal operation will be same as both contain same string.
		System.out.println(s1.equals(s2));
		
		// where will s3 be created ??
		// JVM will concat "a" and "b" then add it to String pool
		String s3 = "a" + "b";
		// s4 referes to already create "ab" in string pool
		String s4 = "ab";
		
		// references for s3 and s4 will be same .
		System.out.println(s3==s4);
		
		String s5 = s1 + "b";
		
		System.out.println(s4==s5);
		//System.out.println(s3.equals(s4));
		
		
		
		
	}
	
}
