package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		Set<Integer> set= new TreeSet<>();
		
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(3);
		
		
		System.out.println(set);
		
		set.remove(1);
		System.out.println(set);
		
		System.out.println(set.contains(2));
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
	}
	
}
