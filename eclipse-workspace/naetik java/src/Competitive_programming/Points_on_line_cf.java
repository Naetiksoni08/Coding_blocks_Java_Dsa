package Competitive_programming;

import java.util.Scanner;

public class Points_on_line_cf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		System.out.println(points(arr, d));
	}

	public static long points(long[] arr, int distance) {
		int j = 0;
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (j + 1 < arr.length && arr[j + 1] - arr[i] <= distance) {
				j++;

			}
			long m = j - i;
			if (m >= 2) {
				ans += m * (m - 1) / 2;
			}
		}
		return ans;

	}
}

//for (int i = 0; i < arr.length; i++) {
//int low = i + 1;
//int high = arr.length - 1;
//int ans = i;
//while (low <= high) {
//	int mid = (low + high) / 2;
//	if (arr[mid] - arr[i] <= distance) {
//		ans = mid;
//		low = mid + 1;
//	} else {e
//		high = mid - 1;
//	}
//
//}
//long len = ans - i;
//if (len >= 2)
//	ans += (len * (len - 1)) / 2;
//
//
//}

//i → fixed first point of the triplet
//j → farthest point to the right such that arr[j] - arr[i] <= d
// Counting points
//The points between i+1 and j (inclusive) are the ones we can choose to complete the triplet with i.
//Number of these points = j - i → this is m
//Example:
//i = 0, j = 3 → points [1,2,3,4]
//m = j - i = 3 → points [2,3,4]
//️ Forming triplets
//To form a triplet, we need 2 more points in addition to the fixed i.
//So:
//If m < 2 → not enough points → cannot form triplet
//If m >= 2 → we can choose any 2 points from these m points → number of triplets = C(m,2) = m*(m-1)/2
//Continuing example:
//m = 3 → triplets = {1,2,3}, {1,2,4}, {1,3,4} → 3 triplets
//Repeat
//Move i forward and repeat the process:
//j will only move forward or stay
//Count triplets for every new i
//So basically:
//Fix a point i
//Find the farthest j within distance d
//Count points between i+1 and j → m = j - i
//If m >= 2, add m*(m-1)/2 to answer