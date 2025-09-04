package assignment_questions;

import java.util.Scanner;

public class painter_partition_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // no of painter
		int n = sc.nextInt(); // no of boards
		int[] boardarray = new int[n];
		for (int i = 0; i < boardarray.length; i++) {
			boardarray[i] = sc.nextInt();
		}
		System.out.println(painter_problem(boardarray, k));

	}

	// nob-->no of boards
	public static int painter_problem(int[] boardarray, int painters) {
		//say array was 10,20,30,40
		int low = 0;
		int high = 0;
		int ans = 0;
		for (int b : boardarray) {
			high += b;  // sum = 100 so high is at 100
			low = Math.max(low, b);  // why this because
//			agar 40 length ka board tha toh that means kabhi na kabhi kisi ek painter ko board paint karna hi padega so answer kabhi bhi 40 sai chota ho hi nai sakta so basically ek ek karke value ayegi maximum update hota rahega aur 40 low mai aah jayega toh ab joh range hogai binary search ki voh hoga from 40 to 100 

		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isitpossible(boardarray, painters, mid) == true) {
				ans = mid;
				high = mid-1;
			}
			else {
				low = mid+1;
			}

		}
		return ans;
	}

	private static boolean isitpossible(int[] boardarray, int painters, int mid) {
		int paintercount =1;
		int noofboardpainted = 0;
		for (int i = 0; i < boardarray.length;) {
		 if(noofboardpainted+boardarray[i]<=mid) {
			 noofboardpainted+=boardarray[i];
			 i++;
		 }
		 else {
			 paintercount++;
			 noofboardpainted = 0;
			 
		 }
		 if(paintercount>painters) {
			 return false;
		 }
			
		}
		return true;
	}

}
