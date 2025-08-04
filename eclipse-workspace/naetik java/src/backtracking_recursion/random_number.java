package backtracking_recursion;

import java.util.Random;

public class random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si = 10; // starting index
		int ei = 100;//ending index
		Random rn = new Random();
		for(int i  = 0 ; i <10; i++) {
			int x = rn.nextInt(ei-si+1)+si; // 10 se 100 ke beech mai kitne numbers hai uska formula 
			System.out.println(x);
		}

	}

}
