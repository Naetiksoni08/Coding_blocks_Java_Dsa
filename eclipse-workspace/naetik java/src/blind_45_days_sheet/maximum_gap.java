package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_gap {

	public static void main(String[] args) {
		// so the thing is that this question is asking us to write a linear algo so
		// basically the two pointer approach was correct but we need to sort the array
		// right which is n log n theke so this will break linear time algo thing theke
		// so we need to perform bucket sort. bucket sort is basically another sorting
		// algo right so basically we need to divide the array in the ranges so
		// baaically lets say we need to analyse 30 student so instead of like seeing
		// all the pairs we will divide the students into thange 0-9 10-19 20-29 and so
		// on then Har student ko uske marks ke hisaab se bucket mein daalo! Phir
		// buckets ko order mein padhlo!

		// so the steps to solve this problem are
//		1. Min aur Max nikalo
//		2. Buckets banao (range divide karo)
//		3. Har element → sahi bucket mein daalo
//		4. Har bucket sort karo
//		5. Buckets ko order mein join karo!

		int[] arr = { 1, 3, 6, 9 };
		int n = arr.length;
		if (arr.length < 2)
			System.out.println(0);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			min = Math.min(num, min);
			max = Math.max(num, max);
		}
		if (min == max)
			System.out.println(0);
		int bucketSize = Math.max(1, (max - min) / (n - 1));
		int bucketCount = (max - min) / bucketSize + 1;
		int[] bucketmin = new int[bucketCount];
		int[] bucketmax = new int[bucketCount];
		Arrays.fill(bucketmin, Integer.MAX_VALUE);
		Arrays.fill(bucketmax, Integer.MIN_VALUE);

		// element ko bucket mai dalo
		for (int num : arr) {
			int idx = (num - min) / bucketSize;
			bucketmin[idx] = Math.min(bucketmin[idx], num);
			bucketmax[idx] = Math.max(bucketmax[idx], num);

		}
		int maxgap = 0;
		int prevmax = bucketmax[0];
		for (int i = 1; i < bucketCount; i++) {
			if (bucketmin[i] == Integer.MAX_VALUE)
				continue;
			maxgap = Math.max(maxgap, bucketmin[i] - prevmax);
			prevmax = bucketmax[i];

		}
		System.out.println(maxgap);
	}

}
