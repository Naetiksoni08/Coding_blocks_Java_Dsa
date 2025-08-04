package backtracking_recursion;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for(int i = 0 ; i<maze.length; i++) {
			String s = sc.next(); 
			for(int j = 0 ; j<s.length(); j++) {
				maze[i][j] = s.charAt(j);
		}
		
			
		}
		int [][] ans = new int [n][m];
		printpath(maze,0,0, ans);
		if(ispath == false) {
			System.out.print("NO PATH FOUND");
		}
	

	}
	static boolean ispath=false;
	public static void printpath(char[][]maze,int cr ,int cc,int [][]ans) {
		if(cr<0 || cc < 0|| cr >= maze.length || cc >= maze[0].length || maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int [] r = { -1,0,1,0};
		int [] c = {0,-1,0,1};      
		for(int i = 0 ; i<c.length; i++) {
			printpath(maze,cr+r[i], cc+c[i],ans); // we have done this if in future we are asked to move in multiple direction her we were asked to move in 4 direction but if we are asked to move in 12 then we have to do this in loop thats is what we have done 
		}
		if(cr==maze.length-1 && cc==maze[0].length-1) {
			display(ans);
			ispath = true;
			return;
		}
		printpath(maze,cr-1,cc,ans); //up direction
		printpath(maze,cr,cc-1,ans); //left direction
		printpath(maze,cr+1,cc,ans); //down direction
		printpath(maze,cr,cc+1,ans); //right direction
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
		
	}
	public static void display(int[][] ans) {
	   for(int i = 0 ; i < ans.length; i++) {
		   for(int j = 0 ; j < ans[0].length; j++) {
			   System.out.print(ans[i][j]+" ");
		   }
		   System.out.println();
	   }
		
	}

}
