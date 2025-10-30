package blind_45_days_sheet;

import java.util.Scanner;

public class Rat_chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		rat_maze(maze, 0, 0, ans);
		if (val == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean val = false;

	// 4 direction and 4 calls
	// cc - current col cr - current row
	public static void rat_maze(char[][] maze, int cc, int cr, int[][] ans) {
		if (cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') { // if equal to X hai
																									// toh cell is
																									// blocked
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ans[cr][cc] = 1;
			val = true;
			Display(ans);
		}

		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] row = { -1, 0, 1, 0 }; // first call row mai -1  {-1,0} first call 0,-1 second call 1,0 third and 0,1 4th call
		int[] col = { 0, -1, 0, 1 }; // first call col mai 0 and so on
		for (int i = 0; i < col.length; i++) {
			rat_maze(maze, cc+col[i], cr+row[i], ans);
		}
//		rat_maze(maze, cc, cr - 1, ans); // up
//		rat_maze(maze, cc - 1, cr, ans); // left
//		rat_maze(maze, cc, cr + 1, ans);// down
//		rat_maze(maze, cc + 1, cr, ans); // right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	private static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
