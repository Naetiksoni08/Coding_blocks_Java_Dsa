package lecture_8;

public class binary_search {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,8,9,10,12,13,14,18,20,22};
		int item = 13;
		System.out.println(binary_search(arr,item));

	}
		public static int binary_search(int arr[], int item) {
			int lo= 0;
			int hi= arr.length-1;
			while(lo<=hi) {
				int mid = (lo+hi)/2;
				if(arr[mid]==item) {
					return mid;
				}else if (arr[mid]>item) {
					hi = mid-1;
				}else {
					lo = mid+1;
				}
				
				
			}
			return -1;
		}

}
