package assignment_questions;

import java.util.Scanner;

public class unique_number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(number(arr));
		

	}
	public static int number(int [] arr) {
	int ans = 0;
	for(int num:arr) {
		ans^=num; // ek ek karke number ayenge so jaise maan le 11 tha toh 1 ayega uska 0^1 = 1 aaya then 1 store hogaya ans mai toh ab next number aya 1 so 1^1 = 0 aur 0 again ans mai sotre hogaya  ab koi akela number ho say 4 voh aaya so 4^0 = 4 toh iske baad number hi nai hai array katam sab khatam 
	}
	return ans;
	}

}
