package lecture_8;

public class insertion_sort {

	public static void main(String[] args) {
		int []arr = {2,3,11,12,6,4,5,8,9};
		sort(arr);
		//System.out.println(insert_last_element(arr,arr.length-1));
		for(int i = 0 ; i <arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}	
		public static void sort(int arr[]) {
			for(int i = 0; i <arr.length; i++) {
				insert_last_element(arr,i);
			}
		}

	public static void insert_last_element(int arr[], int i) {
		int item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j] > item ) {
			arr[j+1] = arr[j];
			arr[j] = item ;
			j--;
		}
		
	}

}

