package assignment_questions;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		reverse(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void reverse(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr,0,n-1);//reverse complete array 7,6,5,4,3,2,1
		reverse(arr,0,k-1);//reverse the array from 0 to 3-1 = 2 that is 7,6,5
		reverse(arr,k,n-1);//reverse the remaining array 3 to 7 1,2,3,4
//		output will be 5,6,7,1,2,3,4..
		
		

	}
	public static void reverse(int [] arr,int i,int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
	}

}
