package assignment_questions;

import java.util.Scanner;

public class Piyush_and_magical_park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 4
		int m = sc.nextInt(); // 4
		int k = sc.nextInt();
		int s = sc.nextInt(); // strength
		char[][] park = new char[n][m];
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[0].length; j++) {
				park[i][j] = sc.next().charAt(0);

			}
		}
		int result = magicalpark(park, k, s);
		if (result != -1) {
			System.out.println("Yes");
			System.out.println(result);
		} else {
			System.out.println("No");
		}

	}

	public static int magicalpark(char[][] park, int k, int s) {
		int strength = s;

		if (strength < k) {
			return -1;
		}
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[0].length; j++) {
				if (park[i][j] == '.') { // obstacles
					strength -= 2;
				} else if (park[i][j] == '*') { // magic beans
					strength += 5;
				}else if (park[i][j] == '#') { // blockades
					break;

				}
				if (j < park[0].length - 1) { // this line does the step -1 part that means it says ki jab tk j joh hai column ke last cell ke equal nai ho jaata tab tk strengh ko strength-1 karo agar last ke equal hota hai toh sirf -2 karenge same for agar last ke equal ho jata hai toh +5 karenge else +4 karnege 
					strength--;
				}

			}
		}
		return (strength >= k) ? strength : -1; // if strength is greater than k then return strength otherwise -1
	}
}

//
//Cell = '.' (dot)
//Last column nahi hai → -2 (dot cost) + -1 (move cost) = -3
//Last column hai → sirf -2
//Cell = '*' (star)
//Last column nahi hai → +5 (star cost) + -1 (move cost) = +4
//Last column hai → sirf +5
//Cell = '#' (hash)
//Row break (baaki cells ignore)
