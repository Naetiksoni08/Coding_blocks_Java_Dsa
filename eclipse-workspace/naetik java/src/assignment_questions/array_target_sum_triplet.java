package assignment_questions;

import java.util.*;


public class array_target_sum_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		int T = sc.nextInt();
		Arrays.sort(arr);
		triplet(arr,T);
	}
	public static void triplet(int []arr,int T) {
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==T) {
						System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
					}
					
				}
				
			}

			
		}
			

		
		
	}

}
