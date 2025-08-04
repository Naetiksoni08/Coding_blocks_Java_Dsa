package oops;

import java.util.Scanner;
import java.util.Stack;

public class Stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of the array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		
		Stockspan(arr);
		System.out.println("END");
		

	}

	public static void Stockspan(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();

			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();

			}
			st.push(i);

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");

		}
	}

}
