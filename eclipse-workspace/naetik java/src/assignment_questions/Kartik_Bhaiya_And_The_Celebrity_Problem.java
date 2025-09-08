package assignment_questions;

import java.util.*;

public class Kartik_Bhaiya_And_The_Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int result = celebrity(arr);
		if(result == -1) {
			System.out.println("No Celebrity");
		}else {
			System.out.println(result);
		}

	}

	public static int celebrity(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i); // har candidate ko push kardia in the stacks
		}
		while (st.size() > 1) { // jab tk ek candidate nai bach jaata in the stack
			int a = st.pop(); // phele 2 candidate nikale humnai stack mai sai
			int b = st.pop();
			if (arr[a][b] == 1) { // agar a,b par 1 hai toh that means ki a knows b
				st.push(b); // if a b ko janta hai toh definately b is the celeb
			} else {
				st.push(a); // varna a hoga
			}
		}
			int candidate = st.pop(); // last candidate ko nikala
			for (int i = 0; i < arr.length; i++) {
				if (i == candidate) {
					continue;
				}
	
				if(arr[candidate][i]==1 || arr[i][candidate]==0) {
					return -1;
				}
			}

			return candidate;
	
		}

	}


