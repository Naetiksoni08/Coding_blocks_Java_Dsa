package hashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>(); // it only stores unique element in set
		set.add(2);
		set.add(21);
		set.add(3);
		set.add(-2);
		set.add(8);
		set.add(10);
		set.add(98); // holds unique data
		set.add(2);
		System.out.println(set);
		// we do not have any get method in set
		// contains (this is get method in set)
		System.out.println(set.contains(109));
	System.out.println(set.contains(2));
		System.out.println(set.size()); // both map and set have size method
	// for each loop
//		for (int i : set) {
//			System.out.print(i + " ");
//
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(2);
		set1.add(21);
		set1.add(3);
		set1.add(-2);
		set1.add(8);
		set1.add(10);
		set1.add(98); // holds unique data
		set1.add(2);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(2);
		set2.add(21);
		set2.add(3);
		set2.add(-2);
		set2.add(8);
		set2.add(10);
		set2.add(98); // holds unique data
		set2.add(2);
		System.out.println(set2);
		//remove
		System.out.println(set.remove(9));
		System.out.println(set.remove(110));
		
		

	}

}
