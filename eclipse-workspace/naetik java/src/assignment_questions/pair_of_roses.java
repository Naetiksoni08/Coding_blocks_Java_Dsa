package assignment_questions;

import java.util.*;


public class pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] pricearr = new int[n];
			for (int i = 0; i < pricearr.length; i++) {
				pricearr[i] = sc.nextInt();
			}
			int money = sc.nextInt();
			Arrays.sort(pricearr);
			sum(pricearr, money);
		t--;
		}

	}

	public static void sum(int[] arr, int money) {
		int start = 0;
		int end = arr.length - 1;
		int mindiff = Integer.MAX_VALUE;
		int rose1=0,rose2=0;
		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == money) {
				int diff = arr[end] - arr[start];
				if (diff < mindiff) {
					rose1 = arr[start];
					rose2 = arr[end];
					mindiff = diff;
				}
				start++;
				end--;
			} else if (sum < money) {
				start++;

			} else {
				end--;
			}

		}
		  System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
	}
}
