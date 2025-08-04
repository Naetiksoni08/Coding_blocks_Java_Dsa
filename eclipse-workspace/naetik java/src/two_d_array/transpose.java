package two_d_array;

public class transpose {

	public static void main(String[] args) {
		int[][] arr = {{2,3,4,6},
				      {1,7,5,8},
				      {9,11,15,16},
				      {10,12,13,14}};
		transpose(arr);
		//display
		for(int i = 0 ; i <arr.length; i++) {
			for(int j = 0 ; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ "  ");
				
			}
			System.out.println();
		}

	}
	public static void transpose(int[][]arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j = i+1; j<arr[0].length;j++) { // i+1 i se ek aage se start karna h
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i]=temp;
			}
		}
	}


}

