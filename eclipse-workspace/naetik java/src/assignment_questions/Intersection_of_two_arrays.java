package assignment_questions;

import java.util.*;


public class Intersection_of_two_arrays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[]arr2 = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[]result = intersection(arr1, arr2);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

	}
	public static int[] intersection(int[]arr1,int[]arr2) {
		Map<Integer, Integer> map = new HashMap<>(); // map lia frequency ka track rakhne ke liye value ke corresponding freq
		for (int i = 0; i < arr1.length; i++) { // loop lagaya koi bhi 1 array par
			if(map.containsKey(arr1[i])) {  // check kia ki map mai already koi element toh presnet nai hai if hai toh
//				int old_value = map.get(arr1[i]);			// purani wali value ko get kia
//				map.put(arr1[i], old_value+1);
				map.put(arr1[i],map.get(arr1[i])+1);// aur uss same value ke corresponding purani wali value mai +1 karke set kardia
			}else {
				map.put(arr1[i], 1);//agar element phele sai nai exist karta toh directly 1 put kardo frequency..
			}
		}
		
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i])&& map.get(arr2[i])>0){ // check ki map mai koi bhi arr2 ka element present hai kya naai aur sath ke saath make sure uss value ki freq is greater than 0
				ll.add(arr2[i]); // that means it is a common element add it in the list
				map.put(arr2[i],map.get(arr2[i])-1); // and reduce the frequency by 1
				
			}
		}
		int[]ans = new int[ll.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ll.get(i);
			
		}
		return ans;
	
	}

}
