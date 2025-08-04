package backtracking_recursion;

import java.util.Scanner;

public class rat_chase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][]maze = new char[n][m];
		for(int i = 0; i<maze.length;i++) {
			String s = sc.next();
			for(int j = 0; i<s.length(); i++) {
				maze[i][j] = s.charAt(j);
			}
					
		}
		
		
		
	}
	
	public static void rat(char[][]maze,int cr, int cc ) {
		if(cc>0 || cr<0||cc>=maze[0].length || cr>=maze.length||maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc] = 'X';
		maze[cr][cc] = 1;
		rat(maze,cr-1,cc); // upward
		rat(maze,cr,cc-1); // left
		rat(maze,cr+1,cc);//downward
		rat(maze,cr,cc+1);//right
		
	}

}
