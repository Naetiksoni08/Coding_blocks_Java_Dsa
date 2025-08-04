package two_d_array;

public class spiralmatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}};

		print(arr);
	}

	public static void print(int[][] arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int totalelement = arr.length * arr[0].length;
		int count = 0;
		while (count < totalelement) {

			for (int i = minc; i <= maxc && count < totalelement; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;

			for (int i = minr; i <= maxr && count < totalelement; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;

			for (int i = maxc; i >= minc && count < totalelement; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;

			for (int i = maxr; i >= minr && count < totalelement; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;

		}
	}

}
