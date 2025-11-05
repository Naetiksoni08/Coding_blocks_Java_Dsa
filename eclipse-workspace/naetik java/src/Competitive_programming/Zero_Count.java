package Competitive_programming;

import java.util.Scanner;

public class Zero_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); // length of string 12
		int k = sc.nextInt(); // 4 ones
		int noofzero = l - k;
		k++;
		System.out.println((noofzero / k) + ((noofzero % k > 0) ? 1 : 0));

	}

}
