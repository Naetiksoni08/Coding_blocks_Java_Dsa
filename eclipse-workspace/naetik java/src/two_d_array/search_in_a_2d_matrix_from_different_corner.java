package two_d_array;

public class search_in_a_2d_matrix_from_different_corner {

	public static void main(String[] args) {
			int[][]arr = {{1,4,7,11,15},
			              {2,5,8,12,19},
			              {3,6,9,16,22},
			              {10,13,14,17,24},
			              {18,21,23,26,30}};
			System.out.println(search(arr,20));

		}

			public static boolean search(int[][]arr,int item) {
				int row = arr.length-1; ;  
				int col = 0;
				while(row>=0 && col<arr[0].length) {
					if(arr[row][col]==item) {
						return true;
					}
					else if(arr[row][col]<item) { // if the data is smaller than our target then we will start moving towards the column
						col++;
					}
					else {
						row--;
					}
				}
				return false;
							// now why we started from 15 only why not from other corners
				
			}

	}


