package assignment_questions;

import java.util.Scanner;

public class split_array_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = split_array(arr, 0, 0, "", 0, "");
		System.out.println(result);

	}

	public static int split_array(int[] arr, int idx, int sum1, String ans1,int sum2,String ans2) {
		if (idx == arr.length) {
			if (sum1 == sum2) { // jab idx == arr.length hoga then only check if sums are equal
				System.out.println(ans1 + " and " + ans2);
				return 1;
			}else {
				return 0;
			}
		}
		

		int result1 = split_array(arr, idx+1, sum1 + arr[idx], ans1 + arr[idx]+" ", sum2,ans2);
		int result2 = split_array(arr, idx+1, sum1, ans1, sum2 + arr[idx], ans2 + arr[idx]+" ");
		return result1+result2;
	}

}
