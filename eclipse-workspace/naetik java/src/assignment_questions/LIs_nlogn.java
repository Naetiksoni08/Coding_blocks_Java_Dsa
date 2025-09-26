package assignment_questions;

import java.util.Scanner;

public class LIs_nlogn {

	public static void main(String[] args) {

		// simple h agar lis wale arr mai agar mera data lis ke ending point sai bada
		// hai toh
		// lis ke end mai data add karde aur lis ek sai increase karde agar ending point
		// sai mera data chota hai toh fir binary search laga aur joh mera data hai usse
		// just bada data dhund lis wale array mai aur replace karde element ko
		// for example lis ka array tha for now 0 1 6 9 ab mere pass aya 12 toh kya end point sai 12 bada hai yes toh lis ke last mai 9 ke baad add kardo aur +1 kardo size
		// agar 8 hota toh hum kehe ki 0,1,6,9 pr binary search laga aur replace karde 8 sai just bada data ko toh ab 0,1,6,8
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(lis(arr));
		

	}
	public static int lis(int[]arr) {
		int [] dp = new int[arr.length];
		 dp[0] = arr[0];
		 int len = 1;
		 for (int i = 1; i < arr.length; i++) {
			if(arr[i]>dp[len-1]) { // if humara data is greater than that of the last element in lis arr
				dp[len]=arr[i]; // yes toh uss length par apna index rakdo aur len bada do
				len++;
				
			}else {
				int idx = binarysearch(dp,0,len-1,arr[i]);
				dp[idx] = arr[i]; // agar just bada data mil gaya hume toh bas uss data ke index pr apna data replace kardo
			}
		}
		 return len;
		
		
	}
	private static int binarysearch(int[] dp, int low, int high, int item) {
		// to find item sai just bada data
		int idx = 0;
		 while(low<=high) {
			  int mid =  (low+high)/2;
			  if(dp[mid]>=item) { // if dp ka mid joh hai voh just bada hai item sai toh yehi hoga humara element 
				  idx = mid; // hume mil gaya but yeh bhi toh possible h na ki usse aur chota data mil jaye toh right mai toh sare bade honge data toh hum left mai search karenge
				  high = mid-1;
			  }else {
				  low = mid+1;
			  }
		 }
		return idx; 
	}

}
