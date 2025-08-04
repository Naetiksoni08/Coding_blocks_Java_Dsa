package hashmap;
import java.util.*;
import java.util.HashMap;
public class group_anagram {

	public static void main(String[] args) {
	   String [] arr = {"eat","tea","tan","ate","nat","bat"};
//	   System.out.println(group(arr[0]));
//	   System.out.println(group(arr[1]));
	   System.out.println(groupanagram(arr));
	   

	   
	}
	public static List<List<String>> groupanagram(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for(int i = 0 ; i<arr.length; i++) {
			String key = group(arr[i]);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
				
				
			}
			map.get(key).add(arr[i]);
			
		}
		List<List<String>> ans = new ArrayList<>();
		for(String key : map.keySet()) {
			ans.add(map.get(key));
			
		}
		return ans;

		
	}
	public static String group(String s) {
		StringBuilder sb = new StringBuilder();
		int [] freq = new int[26];
		for(int i = 0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch- 'a']++;
		}
		for(int i = 0 ; i <freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();
	}

}
