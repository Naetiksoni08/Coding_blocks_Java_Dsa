package blind_45_days_sheet;

import java.util.Scanner;

public class Monu_bhaiya_and_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(monubhaiya(arr, k));

	}
	public static int monubhaiya(int[]arr,int k) {
		int si = 0;
		int ei = 0;
		int count = 0;
		int sum = 0;
		while(ei<arr.length) {
			//grow
			sum+=arr[ei];
			ei++;
			
			//shrink
			while(sum*(ei-si)>=k) {
				sum-=arr[si];
				si++;

			}
			
			//ans
			count+=(ei-si);
		}
		return count;
		
	}

}
