package assignment_questions;

public class selection_so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, -7, 4, 8, 2 };
		sort(arr);
		for(int i = 0 ; i < arr.length; i ++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = miniidx(arr, i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}

	}

	public static int miniidx(int[] arr, int i) {
		int mini = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[mini]) {
				mini = j;
			}
		}
		return mini;
//		basically first element ko minimum bana do so mini = i; so 5 ko minimum bana dia
//		then loop will start form i+1 mtlb 3 se loop will start goes till n-1
//		then we are checking if 5<3.. 5 is less than 3 basically index check honge so we are checking if 1<0 no 5 is not less than 3 so minimum ko update kardo from 3 so now new minimum is 3
	}

}
