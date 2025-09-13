package assignment_questions;

import java.util.*;

public class Min_Stacks {
	static Scanner sc = new Scanner(System.in); // we made the scanner global the reason is if the value im the string
												// arr is push then only we need to input the item or the numbers so if
												// the scanner was a llocal vairbale then i could not access the scanner

	public static void main(String[] args) throws Exception {
		int number = sc.nextInt(); // 7
		String[] stringarr = new String[number];
		for (int i = 0; i < stringarr.length; i++) {
			stringarr[i] = sc.next();
//			push push push getMin pop top getMin
		}
		Stacks(stringarr);
	
	}

	public static void Stacks(String[] stringarr) throws Exception {
		CustomStack st = new CustomStack(); // custom stack use kr rahe hia apne wala not java ka
		for (String value : stringarr) {
			if (value.equals("push")) {
				int item = sc.nextInt(); // -2 0 -3
				st.push(item);
			} else if (value.equals("pop")) {
				st.pop();
			} else if (value.equals("top")) {
				int result = st.peek(); // the reason we stored it in a vairbale is cuz we need to return the value too
				System.out.print(result + " ");
			} else if (value.equals("getMin")) {
				int result = st.getMin();
				System.out.print(result + " ");
			}
		}

	}

	static class CustomStack {
		private int[] arr;
		private int idx = -1;

		public CustomStack() {
			arr = new int[5];
		}

		public CustomStack(int item) {
			arr = new int[item];
		}

		public boolean isEmpty() {
			return idx == -1;

		}

		public boolean isFull() {
			return idx == arr.length;
		}

		public void push(int item) {
			if (isFull()) {
				int[] newarr = new int[arr.length * 2]; // agar array full hogaya toh hume double size ka arr banaya 
				for (int i = 0; i < arr.length; i++) { // traverse kia
					newarr[i] = arr[i]; // arr ke element sare new arr mai copy kiye
				}
				arr = newarr; // arr array ko new arr ka reference mil gaya
			}
			idx++;
			arr[idx] = item;
		}

		public int pop() throws Exception {
			if (isEmpty()) {
				throw new Exception("Stack is Empty");
			}

			int rv = arr[idx];
			idx--;
			return rv;
		}

		public int peek() throws Exception {
			if (isEmpty()) {
				throw new Exception("Stack is Empty");
			}
			int rv = arr[idx];
			return rv;

		}

		public int getMin() {
			int number = Integer.MAX_VALUE;
			for (int i = 0; i <= idx; i++) {
				number = Math.min(number, arr[i]);
			}
			return number;

		}

	}

}
