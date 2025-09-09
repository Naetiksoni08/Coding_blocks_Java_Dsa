package assignment_questions;

import java.util.*;

public class Kartik_sir_and_coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Queries = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		while (Queries > 0) {
			int queryno = sc.nextInt();
			if (queryno == 2) {  
				int modulecost = sc.nextInt();
				st.push(modulecost);
			}else if(queryno==1) {
				if(st.isEmpty()) {
					System.out.println("No Code");
				}else {
					System.out.println(st.pop());
				}
				
			}
			
			Queries--;

		}
		

	}
}


//Agar stack empty hai hi shuru se, toh st.pop() pe program exception (EmptyStackException) dega aur turant crash ho jaayega.