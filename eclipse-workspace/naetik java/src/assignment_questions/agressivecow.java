package assignment_questions;

import java.util.Arrays;

public class agressivecow {
	public static void main(String[] args) {
		int[] stall = { 1, 2, 8, 4, 9 };
		int noc = 3;
		Arrays.sort(stall);
		System.out.println(largestminimum(stall,noc));
	}

	public static int largestminimum(int []stall,int noc) {
		int low = stall[0];
		int high = stall[stall.length-1] - stall[0];
		int ans= 0;
		while(low<=high) {
			int mid  = (low+high)/2;
			if(isitpossible(stall,noc,mid)==true) {
				ans = mid;
				low  = mid+1;
			}
			else {
				high = mid-1;
				
			}
			
		}
		return ans;
	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		int cow = 1;
		int pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow==noc) {
				return true;
			}
		}

		return false;
	}
}
