package comparator_comparable_interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import oops.pair;

public class busy_man {

	public static void main(String[] args) { // greedy approach // this is selection activity problem
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pair[] arr = new pair[n];
		for (int i = 0; i < arr.length; i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			arr[i] = new pair(st, et);
		}
		Arrays.sort(arr, new Comparator<pair>() {
			@Override
			public int compare(pair o1, pair o2) {
				return o1.et - o2.et;

			}

		});
		int activity  = 1;
		int end = arr[0].et;
		for(int i  = 1 ; i<arr.length; i++) {
			if(arr[i].st >= end) {
				activity++;
				end = arr[i].et;
			}
		}
		System.out.println(activity);

	}

	static class pair {
		int st;
		int et;

		public pair(int st, int et) {
			this.st = st;
			this.et = et;
		}
	}

}
