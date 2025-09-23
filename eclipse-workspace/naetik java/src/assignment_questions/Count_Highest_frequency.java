package assignment_questions;

import java.util.*;

public class Count_Highest_frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(intersection(arr));

	}

	public static int intersection(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxFreq = 0;
		int maxElem = arr[0]; // default first element

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
			if(map.get(arr[i]) > maxFreq) {
				maxFreq = map.get(arr[i]);
				maxElem = arr[i];
				
			}

		}
		return maxElem; // cuz we were asked to return the number whose frequency is the most not the value or count of frequency

	}
}


//map.get(arr[i]) → ye current element ki frequency deta hai map se.
//> maxFreq → check kar rahe ho ki kya ye frequency ab tak ke maximum se badi hai.
//Agar haan →
//maxFreq = map.get(arr[i]) → update maximum frequency
//maxElem = arr[i] → update wo element jo ab tak sabse zyada baar aaya
