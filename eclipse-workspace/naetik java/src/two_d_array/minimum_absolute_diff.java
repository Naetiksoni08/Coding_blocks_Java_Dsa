package two_d_array;

import java.util.*;

public class minimum_absolute_diff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int[] A = new int[n1];
		int[] B = new int[n2];
		int[] C = new int[n3];
		for (int i = 0; i < n1; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n2; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < n3; i++) {
			C[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int i = 0, j = 0, k = 0;
		int minDiff = Integer.MAX_VALUE;

		while (i < n1 && j < n2 && k < n3) {
			int max = Math.max(A[i], Math.max(B[j], C[k]));
			int min = Math.min(A[i], Math.min(B[j], C[k]));
			minDiff = Math.min(minDiff, max - min);
			if(A[i]==min) {
				i++;
				
			}else if (B[j] == min) {
				j++;
				
			}else {
				k++;
			}
		}
		System.out.println(minDiff);

	}

}
