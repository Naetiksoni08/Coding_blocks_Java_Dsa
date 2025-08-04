package assignment_questions;

public class productofarrayexceptitself {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] ans = leftside(arr);
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int[] leftside(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];

		}
		int[] right = new int[n];
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];

		}
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
		return left; //this will return the address
	}
	
	//basically we have taken the return type as array so how do we return something when we have taken a array 
//firstly we wont take a new variable product hum already existing array mai return karenge 
//	secondly this return left will return the address of the array so we wont directly do syso(the name of the function) 
//	we will firstly store this array in a array only like int [] ans and we will call the function and then we will loop it and print it 

}
