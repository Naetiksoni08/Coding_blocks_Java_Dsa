package lecture_6;

public class array_swap1 {

	public static void main(String[] args) {
	int arr[]= {3,5,1,7,8};
	System.out.println(arr[0]+ " " +arr[1]); // 3 and 5
	swap(arr[0], arr[1]); // swap 3 and 5
	System.out.println(arr[0]+ " " +arr[1]); // output 5 and 3
	//but no swap is happening
		
}
	
	public static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}	
		

}
	
