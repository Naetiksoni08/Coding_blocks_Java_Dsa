package assignment_questions;

import java.util.Scanner;

public class kth_root {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int t = sc.nextInt();
			while(t>0) {
				long n = sc.nextLong();
				long k = sc.nextLong();
				System.out.println(kth_root(n,k));
				t--;
			}
			
			
			
			
			

		}
		public static int kth_root(long n, long k) {
			long lo= 1;
			long hi = n;
			int ans= 0;
			while(lo<=hi) {
				long mid = (lo+hi)/2;
				if(Math.pow(mid, k) <= n) {
					ans=(int) mid;
					lo=mid+1;
				}else {
					hi = mid-1;
				
				}
			}
			return ans;
		}


	}


