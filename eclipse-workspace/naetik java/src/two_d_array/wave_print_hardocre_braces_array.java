package two_d_array;

public class wave_print_hardocre_braces_array {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4,5},
				    {6,7,8,9,10},
				    {11,12,13,14,15},
				    {16,17,18,19,20}}; // 4x5 matrix 
	     wave_print(arr);
	}
	public static void wave_print(int[][]arr) {
		for(int col = 0; col<arr[0].length; col++) {
			if(col%2==0) {//if even 
				for(int row = 0; row<arr.length;row++) { 
				//then row starts from 0
					System.out.print(arr[row][col]+" "); // does not matter if the loop is first of row or column 
					
					
				}
			}
			else {
				for(int row = arr.length-1; row>=0 ;row--) {
					System.out.print(arr[row][col]+" "); 
					
				}
			}
		}
	}

}
