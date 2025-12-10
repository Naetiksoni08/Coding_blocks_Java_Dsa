package blind_45_days_sheet;

import java.util.*;

public class k_closest_point_to_the_origin {

	class Solution {
		public int[][] kClosest(int[][] points, int k) {

			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // heap stores 0 par distnce 1 par x and 2 par y so we are doing comaprision on the basid of distance 

			for (int[] p : points) { // 3,1
				int x = p[0]; //3
				int y = p[1];//1
				int distance = x * x + y * y; //3*3+1*1 = 10

				pq.offer(new int[] { distance, x, y }); //{10,3,1}

				if (pq.size() > k) { 
					pq.poll(); // took max heap taki largest distance wala joh pair hai voh top par aah jaye fir hum usse easily pop out kar paaye
				}
			}
			int[][] result = new int[k][2];//row 1 size col = 2 
			int i = 0;

			while (!pq.isEmpty()) {
				int[] top = pq.poll();
				result[i][0] = top[1]; // 0,0 par top ka 1 idx yani ki 3
				result[i][1] = top[2]; // 0,1 par top ka 2 idx yani ki 1 [[-2, 2], [3, 1]]
				i++;
			}

			return result;
		}
	}

}
