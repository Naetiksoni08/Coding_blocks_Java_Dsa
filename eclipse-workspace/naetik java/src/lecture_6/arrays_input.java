package lecture_6;

import java.util.Scanner;

public class arrays_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		// we can also write i<arr.length or n both is correct
		for(int i = 0 ; i<arr.length; i++) {

			arr[i] = sc.nextInt(); 		
		}
		display(arr);
		
	}
	
	public static void display(int []arr) {
		for(int i = 0 ; i<arr.length; i++)  {
			System.out.println(arr[i] + " ");
		}
	}
}
//this do not have any significance just we wrote this to under stand how to
// write a array in function 
//but function did not make any significance on the output