package assignment_questions;

import java.util.*;

public class LL_oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ll.add(sc.nextInt());

		}
		List<Integer> result = oddeven(ll);

		for (int x : result) {
		    System.out.print(x + " ");
		}
		System.out.println();
	}

	public static List<Integer> oddeven(List<Integer> ll) {
		List<Integer> result = new ArrayList<>();
		
			for(int x:ll) {
				if(x%2!=0) {
					result.add(x);
				}
			}
			for(int y:ll) {
				if(y%2==0) {
					result.add(y);
				}
			}
			return result;
		}

		

	}