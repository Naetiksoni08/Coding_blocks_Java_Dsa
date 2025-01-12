package LECTURE_7;

public class reversal_algo {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k  = 3;
		Rotate(arr,k);
		for(int i= 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

		
	}
	public static void Rotate(int arr[], int k) {
		int n = arr.length;
		k = k % n;
		// 1 all elements
		reverse(arr, 0, n-1); //0 to 6
		// 2 reverse starting ke n-k element
		reverse(arr, 0, k-1); // 1 2 3 4 so n-k 7-3= 4-1 = 3 because we write n-1
		// 3 reverse last ke k  elements
		reverse(arr, k, n-1); // 4 to 7
		
	}
	public static void reverse(int arr[], int i , int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		
			
		}

	}
}
