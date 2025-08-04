package backtracking_recursion;

public class n_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean [][] board = new boolean[n][n];
		print(board,n,0);
         
	}
	public static void print(boolean[][] board,int tq,int row) {
		if(tq==0) {
			display(board);
			System.out.println();//line change
			return;
			
		}
		for(int col = 0; col<board[0].length;col++) {
			if(issafe(board,row,col)) {
				board[row][col]=true;
				print(board,tq-1,row+1);
				board[row][col] = false;
				//backtracking 
			}
		}
	}
	 public static boolean issafe(boolean[][] board,int row,int col) {
		//up
		 int r = row;
		 while(r>=0) {
			 if(board[r][col] == true) {
				 return false;
			 }
			 r--;
			
		 }
		 r = row;
		 int c = col;
		 //left diagonal
		 while(r>=0 && c>=0) {
			 if(board[r][c]==true) {
				 return false;
			 }
			 r--;
			 c--;
			 
			 
		 }
		 //right diagonal
		 r = row;
		 c = col;
		 while(r>=0 && c<board[0].length) {
			 if(board[r][c]==true) {
				 return false;
				 
			 }
			 r--;
			 c++;
		 }
		 return true;
		 
		
	}
	public static void display(boolean[][] board) {
		for(int i = 0 ; i<board.length;i++) {
			for(int j= 0; j<board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();//display 2d matrix
		}
		
	}
	
}
//52,51
