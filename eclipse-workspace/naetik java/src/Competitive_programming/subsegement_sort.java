package Competitive_programming;

import java.util.*;

public class subsegement_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(subsegement_sort(arr));
		
		

	}
	public static int subsegement_sort(int []arr) {
		int [] sortedarr = arr.clone();
		Arrays.sort(sortedarr);
		
		
		Map<Integer,Integer> FreqA = new HashMap<>();
		Map<Integer,Integer> FreqB = new HashMap<>();
		
		int cut = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(FreqA.containsKey(arr[i])) {
				FreqA.put(arr[i], FreqA.get(arr[i])+1);
			}else {
				FreqA.put(arr[i], 1);
			}
			
			if(FreqB.containsKey(sortedarr[i])) {
				FreqB.put(sortedarr[i], FreqB.get(sortedarr[i])+1);
			}else {
				FreqB.put(sortedarr[i], 1);
			}
			if(FreqA.equals(FreqB)) {
				cut++;
				FreqA.clear();
				FreqB.clear();
			}
 		}
		return cut;
		
	}
}


//remove sort
