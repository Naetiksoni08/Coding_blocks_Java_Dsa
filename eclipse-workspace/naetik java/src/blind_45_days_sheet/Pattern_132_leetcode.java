package blind_45_days_sheet;

import java.util.*;

public class Pattern_132_leetcode {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2 };
		System.out.println(pattern(arr));

	}

	public static boolean pattern(int[] arr) {
		int third = Integer.MIN_VALUE;
		Stack<Integer> st = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < third) {
				return true;
			}
			while (!st.isEmpty() && arr[i] > st.peek()) {
				third = st.pop();
			}
			st.push(arr[i]);
		}
		return false;
	}
}

//Beech wala number (nums[j]) sabse bada hota hai.
//Right me ek aisa number (nums[k]) chahiye jo thoda chhota ho.
//Left me ek aur number (nums[i]) chahiye jo aur chhota ho.
//Basically “small → big → middle” shape.

//Why traverse right → left?
//Right side me bada element milne ki probability zyada hoti hai
//in stack we are storing arr[j] the biggest element third is arr[k] and arr[i] is the current element