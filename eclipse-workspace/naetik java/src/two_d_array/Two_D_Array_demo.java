package two_d_array;

public class Two_D_Array_demo {

	public static void main(String[] args) {
//        int[][]arr;  // in order to represent 2d array then we will write like this [][].. 
		// if we want 3d array then [] [] [] for 4d array [][][][]
		int[][]arr = new int[3][4]; // this is memory allocation it will make 3x4 ka array
		System.out.println(arr);
		int[][] other = arr;
		System.out.println(arr.length); // row length
		System.out.println(arr[0].length); // column length
		System.out.println(arr[1][2]); // because it is an integer which is 0 
	}

}
