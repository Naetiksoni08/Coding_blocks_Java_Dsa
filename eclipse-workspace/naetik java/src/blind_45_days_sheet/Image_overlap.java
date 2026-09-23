package blind_45_days_sheet;

import java.util.*;

public class Image_overlap {
	public static void main(String[] args) {
		int[][] img1 = { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } };
		int[][] img2 = { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };
		
		int n = img1.length;
		List<int[]> point1 = new ArrayList<>();
		List<int[]> point2 = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (img1[i][j] == 1)
					point1.add(new int[] { i, j });
				if (img2[i][j] == 1)
					point2.add(new int[] { i, j });
			}
		}
		if (point1.isEmpty() || point2.isEmpty())
			System.out.println(0);

		HashMap<String, Integer> countmap = new HashMap<>();
		int max = 0;
		for (int[] p1 : point1) {
			for (int[] p2 : point2) {
				int dx = p2[0] - p1[0];
				int dy = p2[1] - p1[1];
				String key = dx + "," + dy;
				int newcount = countmap.getOrDefault(key, 0) + 1;
				countmap.put(key, newcount);

				max = Math.max(max, newcount);
			}
		}
		System.out.println(max);

	}

}


//
//Chalo Example 1 wala hi le lete hain (jo problem mein diya hai), kyunki wahan expected answer 3 hai — perfect for verify karna.
//
//img1 = [[1,1,0],
//        [0,1,0],
//        [0,1,0]]
//
//img2 = [[0,0,0],
//        [0,1,1],
//        [0,0,1]]
//Step 1: Points Nikaalo
//
//points1 (img1 ke saare 1 ke positions, (row, col) format mein):
//
//(0,0), (0,1), (1,1), (2,1)
//
//points2 (img2 ke saare 1 ke positions):
//
//(1,1), (1,2), (2,2)
//Step 2: Har Pair Ke Liye dx, dy Nikaalo
//
//points1 mein 4 points hain, points2 mein 3 points hain → total 4 × 3 = 12 pairs banenge.
//
//p1 (img1)	p2 (img2)	dx = p2[0]-p1[0]	dy = p2[1]-p1[1]	key
//(0,0)	(1,1)	1	1	"1,1"
//(0,0)	(1,2)	1	2	"1,2"
//(0,0)	(2,2)	2	2	"2,2"
//(0,1)	(1,1)	1	0	"1,0"
//(0,1)	(1,2)	1	1	"1,1" 
//(0,1)	(2,2)	2	1	"2,1"
//(1,1)	(1,1)	0	0	"0,0"
//(1,1)	(1,2)	0	1	"0,1"
//(1,1)	(2,2)	1	1	"1,1" 
//(2,1)	(1,1)	-1	0	"-1,0"
//(2,1)	(1,2)	-1	1	"-1,1"
//(2,1)	(2,2)	0	1	"0,1" 
//Step 3: HashMap Kaisa Bana
//
//Ab yeh saari keys countmap mein jaake accumulate hoti hain:
//
//countmap = {
//  "1,1"  : 3   ← teen baar repeat hua!
//  "1,2"  : 1
//  "2,2"  : 1
//  "1,0"  : 1
//  "2,1"  : 1
//  "0,0"  : 1
//  "0,1"  : 2   ← do baar repeat hua
//  "-1,0" : 1
//  "-1,1" : 1
//}
//Step 4: Max Nikaalo
//
//Map mein sabse bada value hai "1,1" → 3.
//
//Matlab: agar img1 ko dx=1, dy=1 se shift karo (yaani right 1, down 1), toh 3 positions par overlap hoga.
//
//Yeh exactly match karta hai problem ke expected output 3 se! 