package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class hashmap_demo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); // this will make a new map
		map.put("Ankit", 77);
		map.put("raj", 97);
		map.put("kunal", 87); // same value
		map.put("ankita", 57);
		map.put("kaju", 87); // value can be duplicate but key can not be duplicate //same value
		map.put("puneet", 67);
		map.put("ankita", 6); // sirf jo value phele dali hai vohi ayegi ankita 2 bar likha hai lekin last jo
								// likha hoga vohi ayegaa
		System.out.println(map);
		// key as null(insertion)
//	map.put(null, 77); // we can insert key as null in map
////		//contains key
		System.out.println(map.containsKey("Ankit")); // gives true and false it is a boolean function
		System.out.println(map.containsKey("ankita"));
//		//get
		System.out.println(map.get("Ankit")); // value nikal ke dedega
		System.out.println(map.get("kunal"));
//		//remove
		System.out.println(map.remove("raj"));
		System.out.println(map.remove("Ankit"));
//		System.out.println(map);
//		// all the complexity is constant O(1)
//		
//		
//		//hash map is implemented by using linked list
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Ankit", 77);
		map1.put("raj", 97);
		map1.put("kunal", 87);
		map1.put("ankita", 57);
		map1.put("kaju", 87);
		map1.put("puneet", 67);
		map1.put("ankita", 6);
		System.out.println(map1); // time complexity of tree map is log of n
		// it sorts the data in alphabetical order
		// we can not insert key as null in this
		// this is implemented using red map tree
		// key ke hisaab se sort hota hai mtlb name
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Ankit", 77);
		map2.put("raj", 97);
		map2.put("kunal", 87);
		map2.put("ankita", 57);
		map2.put("kaju", 87);
		map2.put("puneet", 67);
		map2.put("ankita", 6);
		System.out.println(map2); // linked hash map jaise humne insert kia hai ussi order mai output dikhayega
									// basically preserves the data
		// O(1) time complexity
		Set<String> s = map.keySet(); // map ka sara data ko set mai fill karke return kardega
		System.out.println(s);
		for (String k : s) { // String k: map.keyset()
			System.out.println(k + " " + map.get(k));
		}
	}

}

// map is interface isko new nai kar sakte 
//hash map is a class we can new this 
//key parameter is always unique first parameter
//