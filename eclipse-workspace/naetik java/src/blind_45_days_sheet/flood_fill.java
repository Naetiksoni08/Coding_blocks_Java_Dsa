package blind_45_days_sheet;

import java.util.*;

public class flood_fill {

	class Solution {
		public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) { // DFS
			int originalcolor = image[sr][sc];
			
			if(originalcolor==newcolor) { //1==2 no
				return image;
			}
			Stack<int[]> s = new Stack<>();
			s.push(new int[] {sr,sc});
			while(!s.isEmpty()) {
				//remove
				int[] rv = s.pop();
				int r = rv[0];
				int c = rv[1];
				//ignore
				if(r<0||c<0||r>=image.length||c>=image[0].length) {
					continue;
				}
				if(image[r][c]!=originalcolor) {
					continue;
				}
				//visited mark
				image[r][c] = newcolor;
				
				// Add unvisited nbrs
				
				s.push(new int[] {r+1,c}); // down
				s.push(new int[] {r-1,c}); // up
				s.push(new int[] {r,c+1}); // right
				s.push(new int[] {r,c-1}); // left
			}
			return image;
			
			
		}
	}

}
