package recursion;

public class board_path {

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
		
		print(n, ans+1, curr+1);
		print(n, ans+2, curr+2);
		print(n, ans+3, curr+3);
		
	}

}
