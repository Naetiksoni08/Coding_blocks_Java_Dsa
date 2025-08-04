package assignment_questions;
import java.util.Scanner;

public class search_matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
   
	    int x = sc.nextInt(); // element to be searched
	    int result = search(arr,x);
	    System.out.println(result);
	}

			public static int search(int[][]arr,int item) {
				int row = 0 ;  
				int col = arr[0].length-1;
				while(row<arr.length && col>=0) {
					if(arr[row][col]==item) {
						return 1;
					}
					else if(arr[row][col]>item) { // if the data is bigger than our target then remove or discard the column
						col--;
					}
					else {
						row++;
					}
				}
				return 0;
      	}

   }


//int[][]arr = {{1,4,7,11,15},
//{2,5,8,12,19},
//{3,6,9,16,22},
//{10,13,14,17,24},
//{18,21,23,26,30}};
//System.out.println(search(arr,16));

