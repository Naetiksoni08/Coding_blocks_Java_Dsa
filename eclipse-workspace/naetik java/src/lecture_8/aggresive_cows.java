package lecture_8;

import java.util.Arrays;
import java.util.Scanner;

public class aggresive_cows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int [] stall = new int[n];
		for(int i = 0 ; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(largestminimum(stall,c));
		
	}
	public static int largestminimum(int stall[], int c) {
		int lo = 1;
		int hi = stall[stall.length-1]-stall[0];
		int ans= 0;
		while(lo<=hi) {
			int mid = (hi+lo)/2;
			if(isitpossible(stall,c,mid)==true) {
				ans=mid;
				lo=mid+1;
				
			}else {
				hi = mid-1;
			}
		}
		return ans;
			
		}
	public static boolean isitpossible(int stall[], int c, int mid) {
		int pos =stall[0] ;
		int cow =1;
		for(int i = 1; i<stall.length; i++) {
			if(stall[i]-pos>=mid) {
				pos= stall[i];
				cow++;
			}
			if(cow==c) {
				return true;
			}
		}
		return false;
	}
 }


	
