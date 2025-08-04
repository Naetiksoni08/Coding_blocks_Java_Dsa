package stacks_queue_questions;

import java.util.Stack;

public class largest_rectangle_in_histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,4,6,1,7};
		System.out.println(histogram(arr));

	}
	public static int histogram(int[] arr) {
		int area = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if(st.isEmpty()) {
					area = Math.max(area, h*r);
					
				}
				else {
					int l = st.peek();
					area = Math.max(area, h*(r-l-1));
				}

			}
			st.push(i);
		}
		int r= arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if(st.isEmpty()) {
				area = Math.max(area, h*r);
				
			}
			else {
				int l = st.peek();
				area = Math.max(area, h*(r-l-1));
			}
		}
		return area;
		
	}
}
