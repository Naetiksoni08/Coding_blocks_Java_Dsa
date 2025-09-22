package assignment_questions;

import java.util.*;

public class Exist_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int size = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			for (int i = 0; i < size; i++) {
				set.add(sc.nextInt());
			}
			int queries = sc.nextInt();
			while (queries-- > 0) {
				int query = sc.nextInt();
				if(set.contains(query)) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}

			}
		}

	}

}
