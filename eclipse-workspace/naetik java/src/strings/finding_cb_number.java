package strings;

import java.util.Scanner;

public class finding_cb_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int s = sc.nextInt(); // size of the string
		 sc.nextLine(); // adding new line 
		
		 String S = sc.nextLine(); // digit of the string 
		
		
				printallsubstring(S);
			}

			public static void printallsubstring(String s) {
				int c = 0;
				boolean[] visited = new boolean[s.length()];
				for (int len = 1; len <= s.length(); len++) {
					for (int j = len; j <= s.length(); j++) {
						int i = j - len;
						long x = Long.parseLong(s.substring(i, j));
						if (isCB_Numbers(x) && isvisited(visited, i, j - 1)) {
							c++;
							for (int k = i; k < j; k++) {
								visited[k] = true;
							}
						}

					}
				}
				System.out.println(c);
			}
			public static boolean isvisited(boolean[] visited, int si, int ei) {
				for (int i = si; i <= ei; i++) {
					if (visited[i] == true) {
						return false;
					}
				}
				return true;
			}

			public static boolean isCB_Numbers(long nums) {
				if (nums == 0 || nums == 1) {
					return false;
				}
				int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
				for (int i = 0; i < arr.length; i++) {
					if (nums == arr[i]) {
						return true;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (nums % arr[i] == 0) {
						return false;
					}
				}
				return true;

	}
}