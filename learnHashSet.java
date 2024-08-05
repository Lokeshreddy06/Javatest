package collections;

import java.util.HashSet;
import java.util.Set;

public class learnHashSet {

	public static void main(String[] args) {
		Set<Integer> set= new HashSet<>();
		
		set.add(34);
		set.add(73);
		set.add(54);  
		set.add(3);
		
		
		System.out.println(set);
		
		set.remove(73);
		System.out.println(set);
		
		System.out.println(set.contains(2));
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
	}
	
}
