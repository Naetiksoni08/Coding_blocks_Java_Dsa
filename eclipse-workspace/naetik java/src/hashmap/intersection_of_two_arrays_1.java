package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersection_of_two_arrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 =  {1,2,2,1};
		int [] arr2 =  {2,2};
		int[]result = intersection(arr1,arr2);
		for(int a: result) {
			System.out.print(a+" ");
		}
		
	}
	public static int[] intersection(int[]arr1,int[]arr2) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i <arr1.length; i++) {
			set.add(arr1[i]);
		}
		HashSet<Integer> set1 = new HashSet<>();
		for(int i = 0; i<arr2.length; i++) {
			if(set.contains(arr2[i])) {
				set1.add(arr2[i]);
				
			}
		}
		List<Integer> ll = new ArrayList<>(set1); 
		int [] ans = new int[set1.size()];
		for(int i = 0 ; i<ans.length; i++) {
			ans[i] = ll.get(i);
		}
		return ans;
		
		
	} //order of n + m or n only 
	

}
