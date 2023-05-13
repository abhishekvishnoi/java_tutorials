package core.collections;

import java.util.*;

public class CollectionExamples {
	
	public static void main(String[] args) {
		
		
		HashMap< String, String> hashMap = new HashMap<>();


		TreeSet <String> treeSet = new TreeSet<>();
		
		HashSet <String> hashSet = new HashSet<>();
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		PriorityQueue< String > pqueue = new PriorityQueue<>();

		List<String> l1 = new LinkedList<>();
		l1.add("Arushi");
		l1.add("Abhishek");

		Integer[] a = new Integer[]{ 0,1,2 };

		List<Integer> x = Arrays.asList(a);

		x.add(6);

		System.out.println(x);

	//	Arrays.asList()
		
		
	}

}
