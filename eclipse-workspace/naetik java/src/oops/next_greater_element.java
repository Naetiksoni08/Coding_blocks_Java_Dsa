package oops;

import java.util.Scanner;
import java.util.Stack;

public class next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of the array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
	 nge(arr);

	}

	public static int nge(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];

			}
			st.push(i);

		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print (ans[i]+" ");

		}
		return 1;
		
		

	}
	
}
