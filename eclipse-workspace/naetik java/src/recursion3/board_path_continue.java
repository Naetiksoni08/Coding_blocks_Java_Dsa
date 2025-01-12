package recursion3;

public class board_path_continue {

	public static void main(String[] args) {
		int n = 4;
		print(n,"", 0);

	}
	public static void print(int n , String ans , int curr) {
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		for(int dice = 1; dice<=3; dice++) {
			print(n, ans+dice, curr+dice);
		}
	}

	}


