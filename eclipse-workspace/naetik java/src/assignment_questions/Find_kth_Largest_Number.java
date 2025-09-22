package assignment_questions;

import java.util.*;

public class Find_kth_Largest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		kth_largest(arr, k);

	}

	public static void kth_largest(int[] arr, int k) {// min heap concept why not max heap cuz timecomplextiy of max
														// heap is equal to the the time complexity of sorting the arr
														// that is n log n
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // queue lelia
		for (int i = 0; i < k; i++) { // phele k elements ko yani 2 element ko add kia queue mai
			pq.add(arr[i]); // simply s
		}

		for (int i = k; i < arr.length; i++) { // loop chalaya k element sai
			if (pq.peek() < arr[i]) { // check kia ki agar peek ka data chota hai arr ke data sai toh bhai ab tu
										// topper nai hai
				pq.poll(); // remove kardo
				pq.add(arr[i]); // aur new topper ko add kardo
			}
		}
		System.out.println(pq.peek()); // ab joh sabsai upar joh betha hoga vohi answer hoga

	}

}
