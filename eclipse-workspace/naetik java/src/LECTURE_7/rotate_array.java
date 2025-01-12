package LECTURE_7;

public class rotate_array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k  = 3;
		rotate(arr,k);
		for(int i= 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}
	public static void rotate(int arr [], int k ) {
		int n = arr.length;
		k = k % arr.length; // repeat after k = 7;// we took this if the k is bigger than n for example n=7 if k =103 then 103%7=5tth rotation 
		for(int j = 1 ; j<=k; j++) {
		int item = arr[n-1]; // store the last index n-1 in index
		for(int i = n-2; i>=0; i--) { // 5 se start 0 tak chalo or i-- 5 4 3 2 1 0
			arr[i+1] = arr[i]; // for 5+1= 6 = array 5 // 5 ko 6 index par bhejo // 5 ki  value 6th par likho 
		}
		arr[0] = item; // 0 index par daldoo 
		}
		
	}

}
