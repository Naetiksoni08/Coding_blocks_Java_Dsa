package assignment_questions;

public class Insertion {
	public static void main(String[] args) {
		int []arr = {1,2,3,5,7,2};
		insertionsort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void insertionsort(int []arr) {
		for (int i = 1; i < arr.length; i++) {
			sortLastlement(arr, i);
		}
	}
	public static void sortLastlement(int[]arr,int i) {
		int item = arr[i];
		int j = i-1;
		while(arr[j]>item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
	}
}
