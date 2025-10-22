package Competitive_programming;

import java.util.*;

public class Ferris_wheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int i = 0;
		int j = arr.length-1;
		int gondola = 0;
		while(i<=j) {
			if(arr[i]+arr[j]<=w) {
				i++;
				j--;
				gondola++;
			}else {
				j--;
				gondola++;
			}
		}
		System.out.println(gondola);
		
		
	}

	
}
