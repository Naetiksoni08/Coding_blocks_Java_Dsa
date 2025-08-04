package array_list;

import java.util.ArrayList;

public class array_list_demo2 {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>(100); // capacity can be 1 or 100 anything

		// add
		ll.add(10);
		ll.add(1);
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(17);
		ll.add(19);
		ll.add(1, 7);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		// for each loop
		// for each loop can not run in backward direction only in front direction it
		// works
		System.out.println();
		boolean[] arr = new boolean[6]; // you can change the capacity by yourself
		for (int x : ll) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (boolean x : arr) {
			System.out.print(x + " "); // default value of boolean is false
		}

	}

}
