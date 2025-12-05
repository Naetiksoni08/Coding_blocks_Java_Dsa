package Competitive_programming;

public class fenwick_tree {

	class Tree {
		private int[] arr;

		public int update(int idx, int val) {
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for (; idx <= max;) {
				if (arr[idx] > max) {
					sum += arr[idx];
					max = sum;
				}

			}

		}

		public int query(int i) {
			int sum = 0;
			

		}

		public static void main(String[] args) {
			fenwick_tree ft = new fenwick_tree();
			

		}
	}

}