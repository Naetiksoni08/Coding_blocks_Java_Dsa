package assignment_questions;

import java.util.*;
public class Randomized_quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 1, 4, 3 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = partition(arr, si, ei);
		sort(arr, si, idx - 1);
		sort(arr, idx + 1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {
		// randomized quick sort says that aap last element ko pivot element mt manao random koi element ko pivot manlo aur uske last index ke sath swap kardo 
//		for example 1,2,3,4,5 ab worst case tc abhi n^2 hai isko n log n mai lane ko interviewer bolega toh bas kya karega jaise tune pivot nikala random 2 aur usko 5 ke sath swap kardia ab arr bana 1,5,3,4,2 now it is unsorted ab isko normal qucik sort sai solve karlo bas 
		Random rn = new Random();
		int randomidx = rn.nextInt(ei-si+1)+si;
		int temp1 = arr[randomidx];
		arr[randomidx] = arr[ei];
		arr[ei] = temp1;
		//so basically ek random element uthaya aur uska last index ke sath swap kardia bas that is randomized quick sort ab tc hogai n log n 
		
 		int pivot = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i]; // swap arr[i],arr[idx]
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;

			}

		}
		int temp = arr[ei];// swap arr[ei],arr[idx]
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
	}

}
