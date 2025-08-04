package lecture_6;

public class array_swap2 {

	public static void main(String[] args) {
			int arr[]= {3,5,1,7,8};
			System.out.println(arr[0]+ " " +arr[1]); // 3 and 5
			swap(arr,0,1); // 3 and 5
			System.out.println(arr[0]+ " " +arr[1]); // 5 and 3
	}
	
	public static void swap(int []arr,int i   , int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}

	// this is how we do swapping in array we have to call the value we 
// want to swap not the swap(arr[0], arr[1]); function 
