package assignment_questions;

import java.util.*;


public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Histogram(arr));
	}

	public static int Histogram(int[] arr) {
		int area = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int right = i;
				if (st.isEmpty()) {
					area = Math.max(area, h * right); // if last element in the stacks

				} else {
					int left = st.peek(); // sabsai upar joh stacks par element hoga vohi peek karlenge
					area = Math.max(area, h * (right - left - 1));
				}

			}
			st.push(i);
			
		}
		int r = arr.length; // ek bar assume karli humnai
		while(!st.isEmpty()) {
			int h = arr[st.pop()];
			if(st.isEmpty()) {
				area = Math.max(area, h * r);
			}else {
				int left = st.peek();
				area = Math.max(area, h * (r - left - 1));
			}
		}
		return area;
	}

}
