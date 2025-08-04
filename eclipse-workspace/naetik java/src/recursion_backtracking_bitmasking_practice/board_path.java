package recursion_backtracking_bitmasking_practice;

public class board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printboard(n,0,"");
		System.out.println(count);
		

	}
	static int count  = 0;
	public static void printboard(int n , int curr,String ans) {
		if(curr>n) {
			return;
			
		}
		if(curr == n) {
			System.out.println(ans);
			count++;
			return;
		}
		for(int dice = 1; dice<=3; dice++) {
			printboard(n,curr+dice,ans+dice);
		}
		
//		printboard(n,curr+1,ans+1);
//		printboard(n,curr+2,ans+2);
//		printboard(n,curr+3,ans+3);
//		
//		
		
		
	}

}
