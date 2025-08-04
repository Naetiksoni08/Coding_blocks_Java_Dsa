package lecture_6;

public class reverse_particular_array {

	public static void main(String[] args) {
		int []arr = {3, 5 ,1 ,7 , 8 ,6 , 9 , 11 , 15 , 17 , 18 , 16 ,23 , 27 };
		reverse(arr, 3, 11);
		for(int i = 0 ; i < arr.length ; i++) {
		    System.out.println(arr[i] + " ");
	}
}		
	public static void reverse(int[] arr,int i , int j ) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		
			
		}

	}
	
}
//reverse 7 , 8 ,6 , 10 , 1 , 2 , 3 , 4  from i = 3 to j =12
//output is 3 ,5, 1, 16, 18, 17, 15, 11, 9, 6, 8, 7, 23, 27
