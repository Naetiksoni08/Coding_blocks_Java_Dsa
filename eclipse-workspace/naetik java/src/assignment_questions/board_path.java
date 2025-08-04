package assignment_questions;

public class board_path {

	public static void main(String[] args) {
	
				int n = 4;
				System.out.println(Count(n,"",0));

			}

			public static int Count(int n, String ans, int curr) {
				if (curr == n) {
					System.out.println(ans);
					return 1;
				}
				if (curr > n) {
					return 0;
				}
		       	int sum = 0;
				for (int dice = 1; dice <= 3; dice++) {
					sum+=Count(n, ans + dice, curr + dice);
				}
				
				
				return sum;

				
			}
			

		}